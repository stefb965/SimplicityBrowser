package com.creativetrends.simplicity.app.utils;

import android.graphics.Bitmap;

/**Created by Creative Trends Apps on 10/19/2016.*/

public class Bookmark {
    private String title;
    private String url;
    private Bitmap image;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return this.title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
