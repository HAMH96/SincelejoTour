package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

public class ProfileActivity extends DrawerActivity {

    //private String username;
    //private String email;
    //private TextView userD;
    //private TextView emailD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data=getIntent().getExtras();
        setContentView(R.layout.activity_profile);
        userI = (TextView) findViewById(R.id.userData);
        emailI = (TextView) findViewById(R.id.emailData);
        //Bundle data=getIntent().getExtras();
        //username = data.getString("username");
        //email = data.getString("correo");
        userI.setText(username);
        emailI.setText(email);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_p,menu);
        return true;
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent;
        switch(id){
            case R.id.principal:
                intent = new Intent(ProfileActivity.this,MainActivity.class);
                intent.putExtra("username",1);
                startActivity(intent);
                finish();
                break;

            case R.id.pToHotels:
                intent = new Intent(ProfileActivity.this,HotelActivity.class);
                intent.putExtra("username",1);
                startActivity(intent);
                finish();
                break;
            case R.id.pToBars:
                intent = new Intent(ProfileActivity.this,BarActivity.class);
                intent.putExtra("username",1);
                startActivity(intent);
                finish();
                break;
            case R.id.pToRest:
                intent = new Intent(ProfileActivity.this,RestaurantActivity.class);
                intent.putExtra("username",1);
                startActivity(intent);
                finish();
                break;

            case R.id.cerrarSesion:
                intent = new Intent(ProfileActivity.this,LoginActivity.class);
                intent.putExtra("username",1);
                startActivity(intent);
                finish();
                break;
        }
        return true;
    }*/

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(ProfileActivity.this,MainActivity.class);
        intent.putExtra("username",username);
        intent.putExtra("email",email);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Intent intent;
        switch(id){
            case R.id.nav_bars:
                intent = new Intent(ProfileActivity.this,BarsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_logout:
                intent = new Intent(ProfileActivity.this,LoginActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                setResult(RESULT_CANCELED,intent);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_hotels:
                intent = new Intent(ProfileActivity.this,HotelsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_restaurants:
                intent = new Intent(ProfileActivity.this,RestaurantsActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_main:
                intent = new Intent(ProfileActivity.this,MainActivity.class);
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
