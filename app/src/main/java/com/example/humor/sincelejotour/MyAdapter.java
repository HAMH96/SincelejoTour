package com.example.humor.sincelejotour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<ListaActivity> {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<String> mDataSource;

    public MyAdapter(Context context, ArrayList<ListaActivity> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ListaActivity codes = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_bands, parent, false);
        }
        //mInflater.inflate(R.layout.list_item_bands, parent, false);
        // Lookup view for data population
        TextView tvColor = (TextView) convertView.findViewById(R.id.list_title);
        TextView tvBand = (TextView) convertView.findViewById(R.id.list_subtitle);
        ImageView ivIcon = (ImageView) convertView.findViewById(R.id.list_icon);
        // Populate the data into the template view using the data object
        tvColor.setText(codes.color);
        tvBand.setText(codes.band);
        ivIcon.setImageResource(codes.imageId);
        // Return the completed view to render on screen
        return convertView;
    }