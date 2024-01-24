package com.isip.serujimir.bestappdeveloper.bodies;

import android.graphics.drawable.Drawable;

public class News {
    private String text1, text2, text3;

    public News(String text1, String text2, String text3, Drawable drawable) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.drawable = drawable;
    }

    private Drawable drawable;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
