package com.ek.firebaselogin.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("video")
    @Expose
    private VideoExt video;

    public VideoExt getVideo() {
        return video;
    }

    public void setVideo(VideoExt video) {
        this.video = video;
    }

    public Video withVideo(VideoExt video) {
        this.video = video;
        return this;
    }

}
