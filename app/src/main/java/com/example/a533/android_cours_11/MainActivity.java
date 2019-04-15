package com.example.a533.android_cours_11;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setObjectToDisplay();
    }

    private void setObjectToDisplay(){
        Bitmap planBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.plan);
        PlanView planView = findViewById(R.id.PlanView1);
        planView.addElementToDisplay(new Plan(planBitmap));
    }

    private void onLongPress(){
        Bitmap planBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.marker);
        PlanView planView = findViewById(R.id.PlanView1);
        planView.addElementToDisplay(new Plan(planBitmap));

    }

}
