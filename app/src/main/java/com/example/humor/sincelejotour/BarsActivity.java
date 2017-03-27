package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsActivity extends DrawerActivity {

    ListView listBars;
    ArrayList<ListaActivity> list;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);
        list= ListaActivity.barData(this);
        adapter= new MyAdapter(this,list);
        listBars = (ListView) findViewById(R.id.listBar);
        listBars.setAdapter(adapter);
        listBars.setOnItemClickListener(listenerAdapter);
    }
    AdapterView.OnItemClickListener listenerAdapter = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            //ListaActivity manager = list.get(position);
            //Intent intent = new Intent(this, ACtivityX.class);
            //intent.putExtra("title", manager.getName());
        }
    };

    @Override
    public void onBackPressed() {
        Intent intent;
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            intent = new Intent(BarsActivity.this,MainActivity.class);
            intent.putExtra("username",1);
            startActivity(intent);
            finish();
        }
    }
}
