package com.elijahdesign.myrecyclerview;

import android.graphics.drawable.Drawable;

/**
 * Created by Elijah on 7/14/2016.
 */
public class Square {

    Drawable drawable;
    String color;

    public Square(Drawable drawable, String color) {
        this.drawable = drawable;
        this.color = color;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
