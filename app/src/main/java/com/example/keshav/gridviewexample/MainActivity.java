package com.example.keshav.gridviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
private GridView gridView;
    private int[] thumbnails={
            R.drawable.sample_0,R.drawable.sample_1,
            R.drawable.sample_2,R.drawable.sample_3,
            R.drawable.sample_4,R.drawable.sample_5,
            R.drawable.sample_6,R.drawable.sample_7,
            R.drawable.sample_0,R.drawable.sample_1,
            R.drawable.sample_2,R.drawable.sample_3,
            R.drawable.sample_4,R.drawable.sample_5,
            R.drawable.sample_6,R.drawable.sample_7 };
    private String[] name={"Dog 0","Dog 1","Dog 2","Dog 3","Dog 4","Dog 5","Dog 6","Dog 7",
            "Dog 0","Dog 1","Dog 2","Dog 3","Dog 4","Dog 5","Dog 6","Dog 7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this,thumbnails,name));
        gridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this,"position : "+position,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,ImageActivity.class);
        intent.putExtra("image",thumbnails[position]);
        startActivity(intent);
    }
}
