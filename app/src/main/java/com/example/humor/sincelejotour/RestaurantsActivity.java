package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends DrawerActivity {

    ListView listBars;
    ArrayList<ListaActivity> list;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getExtras();
        setContentView(R.layout.activity_restaurants);
        list= ListaActivity.restautantData(this);
        adapter= new MyAdapter(this,list);
        listBars = (ListView) findViewById(R.id.listRestaurant);
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
            intent = new Intent(RestaurantsActivity.this,MainActivity.class);
            intent.putExtra("username",username);
            intent.putExtra("email",email);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Intent intent;
        switch(id){
            case R.id.nav_profile:
                intent = new Intent(RestaurantsActivity.this,ProfileActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_logout:
                intent = new Intent(RestaurantsActivity.this,LoginActivity.class);
                setResult(RESULT_CANCELED,intent);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_hotels:
                intent = new Intent(RestaurantsActivity.this,HotelsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_bars:
                intent = new Intent(RestaurantsActivity.this,BarsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_main:
                intent = new Intent(RestaurantsActivity.this,MainActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
        }
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
