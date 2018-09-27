package com.example.keshav.gridviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.chrisbanes.photoview.PhotoView;

public class ImageActivity extends AppCompatActivity{
private PhotoView photoView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        photoView=findViewById(R.id.photoView);
        intent=getIntent();
        photoView.setImageResource(intent.getIntExtra("image",0));


    }


}
