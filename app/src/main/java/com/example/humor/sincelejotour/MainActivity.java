package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends DrawerActivity {

    private String username;
    private String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bundle data = getIntent().getExtras();
        //username = data.getString("username");
        //email = data.getString("email");


        //FragmentManager fm = getSupportFragmentManager();
        //FragmentTransaction ft = fm.beginTransaction();
        MapFragment fragment = new MapFragment();
        //FrameLayout activityContainer = (FrameLayout) drawer.findViewById(R.id.activity_content);
        //getLayoutInflater().inflate(R.layout.activity_maps, activityContainer, true);
        //ft.add(android.R.id.content,fragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
    }

    //username = extras.getString("username");
    //correo = extras.getString("correo");


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }11

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent;
        switch(id){
            case R.id.mPerfil:
                intent = new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",email);
                startActivity(intent);
                finish();
                break;
            case R.id.cerrarSesion:
                intent = new Intent(MainActivity.this,LoginActivity.class);
                setResult(RESULT_CANCELED,intent);
                startActivity(intent);
                finish();
                break;
            case R.id.hotels:
                intent = new Intent(MainActivity.this,HotelActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.bars:
                intent = new Intent(MainActivity.this,BarActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.restaurants:
                intent = new Intent(MainActivity.this,RestaurantActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return true;
    }*/

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Intent intent;
        switch(id){
            case R.id.nav_profile:
                intent = new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_logout:
                intent = new Intent(MainActivity.this,LoginActivity.class);
                setResult(RESULT_CANCELED,intent);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_hotels:
                intent = new Intent(MainActivity.this,HotelsActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_bars:
                intent = new Intent(MainActivity.this,BarsActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_restaurants:
                intent = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
