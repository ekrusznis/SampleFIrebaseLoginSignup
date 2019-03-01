package com.ek.firebaselogin.Adapters;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ek.firebaselogin.Helper.CircleTransform;
import com.ek.firebaselogin.Models.Datum;
import com.ek.firebaselogin.NewModels.SearchVidResponse;
import com.ek.firebaselogin.NewModels.Video;
import com.ek.firebaselogin.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.CustomViewHolder> {

    private Context context;
//    private List<Datum> dataList;
    private List<Video> videos;

    public VerticalAdapter(Context context, List<Video> videos){
        this.context = context;
        this.videos = videos;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

//        view.setOnClickListener(this);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(VerticalAdapter.CustomViewHolder holder, int position) {
//        Datum datum = dataList.get(position);
        Video video = videos.get(position);

        Picasso.get()
                .load(video.getVideo().getDefaultThumb())
                .into(holder.fullImage);
//        Picasso.get()
//                .load(datum.getImage())
//                .into(holder.fullImage);

        holder.nameTextView.setText(videos.get(position).getVideo().getTitle());

        Picasso.get()
                .load(videos.get(position).getVideo().getEmbedUrl())
                .transform(new CircleTransform())
                .into(holder.profileImage);

        holder.profileName.setText(videos.get(position).getVideo().getVideoId());
    }

    @Override
    public int getItemCount() {
        return (videos!=null ? videos.size() : 0);
    }


    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        ImageView fullImage;
        ImageView profileImage;
        TextView nameTextView;
        TextView profileName;
        TextView timeStamp;
        CardView cardView;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        CustomViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
            profileName = (TextView) itemView.findViewById(R.id.profile_name);
            timeStamp = (TextView) itemView.findViewById(R.id.time_stamp);
            fullImage = (ImageView) itemView.findViewById(R.id.full_image);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_image);
            cardView = (CardView) itemView.findViewById(R.id.card_view);

            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            Toast.makeText(context, videos.get(clickedPosition).getVideo().getTitle(), Toast.LENGTH_LONG).show();
        }
    }
}
