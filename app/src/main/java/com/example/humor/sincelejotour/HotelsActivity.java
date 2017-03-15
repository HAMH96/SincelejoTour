package com.example.humor.sincelejotour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    ListView listHotels;
    ArrayList<ListaActivity> list;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        list= ListaActivity.hotelData(this);
        adapter= new MyAdapter(this,list);
        listHotels.findViewById(R.id.listHotel);
    }
    AdapterView.OnItemClickListener listenerAdapt
}
