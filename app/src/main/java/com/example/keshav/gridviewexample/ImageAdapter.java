package com.example.keshav.gridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private int thumbnails[];
    private String text[];

    public ImageAdapter(Context context,int []thumbnails,String[] text) {
        this.context = context;
        this.thumbnails=thumbnails;
        this.text=text;
    }

    @Override
    public int getCount() {
        return thumbnails.length;
    }

    @Override
    public Object getItem(int position) {
        return thumbnails[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView textView = null;
    LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    convertView=layoutInflater.inflate(R.layout.grid_view,null);

            imageView=convertView.findViewById(R.id.imageView);
            textView=convertView.findViewById(R.id.textView);


        imageView.setImageResource(thumbnails[position]);
        textView.setText(text[position]);
        imageView.setPadding(5,5,5,5);

        return convertView;
    }
}
