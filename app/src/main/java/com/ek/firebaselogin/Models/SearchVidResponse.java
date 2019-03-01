package com.ek.firebaselogin.Models;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchVidResponse {
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public SearchVidResponse withVideos(List<Video> videos) {
        this.videos = videos;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchVidResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

}
