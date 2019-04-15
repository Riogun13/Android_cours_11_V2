package com.example.a533.android_cours_11;

import android.graphics.Bitmap;

public class Plan implements PlanViewDisplayable {
    private float positionX=0;
    private float positionY=0;
    private Bitmap plan;

    public Plan(Bitmap plan){
        this.plan = plan;
    }

    @Override
    public float getPositionX() {
        return positionX;
    }

    @Override
    public float getPositionY() {
        return positionY;
    }

    @Override
    public float getHeight() {
        return plan.getHeight();
    }

    @Override
    public float getWidth() {
        return plan.getWidth();
    }

    @Override
    public Bitmap getBitmap() {
        return plan;
    }

}
