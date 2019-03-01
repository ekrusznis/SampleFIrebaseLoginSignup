package com.ek.firebaselogin.UI;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.ek.firebaselogin.API.ApiInterface;
import com.ek.firebaselogin.API.RetrofitApiClient;
import com.ek.firebaselogin.Adapters.VerticalAdapter;
import com.ek.firebaselogin.Helper.NetworkCheckingClass;
import com.ek.firebaselogin.Models.SearchVidResponse;
import com.ek.firebaselogin.Models.Video;
import com.ek.firebaselogin.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewHorizontal;
    RecyclerView recyclerViewVertical;
    VerticalAdapter verticalAdapter;
    List<Video> dataList;
    ProgressBar progressBar;
    RelativeLayout relativeLayout;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        recyclerViewHorizontal = (RecyclerView) findViewById(R.id.horizontal_recycler_view);
        recyclerViewVertical = (RecyclerView) findViewById(R.id.vertical_recycler_view);
        recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewVertical.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        apiInterface = RetrofitApiClient.getClient().create(ApiInterface.class);

        if (NetworkCheckingClass.isNetworkAvailable(this)) {
            progressBar.setVisibility(View.VISIBLE);
            fetchData();
        } else {
            progressBar.setVisibility(View.GONE);
            Toast.makeText(this, "No internet Connection", Toast.LENGTH_LONG).show();
        }

    }

    private void fetchData() {

        Call<SearchVidResponse> call = apiInterface.apiCall();
        call.enqueue(new Callback<SearchVidResponse>() {
            @Override
            public void onResponse(Call<SearchVidResponse> call, Response<SearchVidResponse> response) {

                SearchVidResponse jsonData = response.body();

//                popularList = jsonData.getPopular();
                dataList = jsonData.getVideos();
                progressBar.setVisibility(View.GONE);
                relativeLayout.setBackgroundColor(Color.parseColor("#3481c1"));


//                horizontalAdapter = new HorizontalAdapter(MainActivity.this, popularList);
                verticalAdapter = new VerticalAdapter(MainActivity.this, dataList);
                recyclerViewVertical.setAdapter(verticalAdapter);
            }

            @Override
            public void onFailure(Call<SearchVidResponse> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
