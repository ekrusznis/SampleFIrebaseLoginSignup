package com.ek.firebaselogin.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoExt {

    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("video_id")
    @Expose
    private String videoId;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("ratings")
    @Expose
    private String ratings;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("default_thumb")
    @Expose
    private String defaultThumb;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("thumbs")
    @Expose
    private List<Thumb> thumbs = null;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public VideoExt withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public VideoExt withViews(Integer views) {
        this.views = views;
        return this;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public VideoExt withVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public VideoExt withRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public VideoExt withRatings(String ratings) {
        this.ratings = ratings;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VideoExt withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoExt withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public VideoExt withEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }

    public String getDefaultThumb() {
        return defaultThumb;
    }

    public void setDefaultThumb(String defaultThumb) {
        this.defaultThumb = defaultThumb;
    }

    public VideoExt withDefaultThumb(String defaultThumb) {
        this.defaultThumb = defaultThumb;
        return this;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public VideoExt withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public VideoExt withPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    public List<Thumb> getThumbs() {
        return thumbs;
    }

    public void setThumbs(List<Thumb> thumbs) {
        this.thumbs = thumbs;
    }

    public VideoExt withThumbs(List<Thumb> thumbs) {
        this.thumbs = thumbs;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VideoExt withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
