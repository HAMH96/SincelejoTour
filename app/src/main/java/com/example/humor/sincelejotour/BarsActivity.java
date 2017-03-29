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

public class BarsActivity extends DrawerActivity {

    ListView listBars;
    ArrayList<ListaActivity> list;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getExtras();
        setContentView(R.layout.activity_bars);
        list= ListaActivity.barData(this);
        adapter= new MyAdapter(this,list);
        listBars = (ListView) findViewById(R.id.listBar);
        listBars.setAdapter(adapter);
        listBars.setOnItemClickListener(listenerAdapter);
        getSupportActionBar().setTitle(R.string.bars);
        MenuItem item = navigationView.getMenu().getItem(2);
        item.setChecked(true);
    }

    AdapterView.OnItemClickListener listenerAdapter = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent intent = new Intent(BarsActivity.this, InfoActivity.class);
            intent.putExtra("position",position);
            intent.putExtra("ident",2);
            intent.putExtra("username",username);
            intent.putExtra("email",email);
            startActivity(intent);
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
                intent = new Intent(BarsActivity.this,ProfileActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_logout:
                intent = new Intent(BarsActivity.this,LoginActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                setResult(RESULT_CANCELED,intent);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_hotels:
                intent = new Intent(BarsActivity.this,HotelsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_restaurants:
                intent = new Intent(BarsActivity.this,RestaurantsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_main:
                intent = new Intent(BarsActivity.this,MainActivity.class);
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
