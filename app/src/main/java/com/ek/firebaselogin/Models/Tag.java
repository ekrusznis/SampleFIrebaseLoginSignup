package com.ek.firebaselogin.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {
    @SerializedName("tag_name")
    @Expose
    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Tag withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

}