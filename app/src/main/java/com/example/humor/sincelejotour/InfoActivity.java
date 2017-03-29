package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private int position;
    private int ident;
    private String username;
    private String email;

    private TextView title;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle data = getIntent().getExtras();
        position = data.getInt("position");
        ident = data.getInt("ident");
        username = data.getString("username");
        email = data.getString("email");
        title = (TextView) findViewById(R.id.titleInfo);
        info = (TextView) findViewById(R.id.descrInfo);
        image = (ImageView) findViewById(R.id.imageInfo);
        Toolbar toolbar;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.info);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        switch (ident){
            case 1:
                if (position==0){
                    title.setText(R.string.hotel2);
                    info.setText(R.string.hotel2);
                    image.setImageResource(R.drawable.hotel_arawak);
                }
                else if(position==1){
                    title.setText(R.string.hotel1);
                    info.setText(R.string.hotel1);
                    image.setImageResource(R.drawable.hotel_malibu);
                }
                else if(position==2){
                    title.setText(R.string.hotel3);
                    info.setText(R.string.hotel3);
                    image.setImageResource(R.drawable.hotel_panorama);
                }
                break;
            case 2:
                if (position==0){
                    title.setText(R.string.bar1);
                    info.setText(R.string.bar1);
                    image.setImageResource(R.drawable.kantaleta);
                }
                else if(position==1){
                    title.setText(R.string.bar2);
                    info.setText(R.string.bar2);
                    image.setImageResource(R.drawable.wepaje);
                }
                else if(position==2){
                    title.setText(R.string.bar3);
                    info.setText(R.string.bar3);
                    image.setImageResource(R.drawable.ruta69);
                }
                break;
            case 3:
                if (position==0){
                    title.setText(R.string.rest1);
                    info.setText(R.string.rest1);
                    image.setImageResource(R.drawable.zaitun);
                }
                else if(position==1){
                    title.setText(R.string.rest2);
                    info.setText(R.string.rest2);
                    image.setImageResource(R.drawable.arcanos);
                }
                else if(position==2){
                    title.setText(R.string.rest3);
                    info.setText(R.string.rest3);
                    image.setImageResource(R.drawable.cajita);
                }
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            Intent intent;
            switch(ident){
                case 1:
                    intent = new Intent(InfoActivity.this,HotelsActivity.class);
                    intent.putExtra("username",username);
                    intent.putExtra("email",email);
                    startActivity(intent);
                    finish();
                    break;
                case 2:
                    intent = new Intent(InfoActivity.this,BarsActivity.class);
                    intent.putExtra("username",username);
                    intent.putExtra("email",email);
                    startActivity(intent);
                    finish();
                    break;
                case 3:
                    intent = new Intent(InfoActivity.this,RestaurantsActivity.class);
                    intent.putExtra("username",username);
                    intent.putExtra("email",email);
                    startActivity(intent);
                    finish();
                    break;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent;
        switch (ident) {
            case 1:
                intent = new Intent(InfoActivity.this, HotelsActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                startActivity(intent);
                finish();
                break;
            case 2:
                intent = new Intent(InfoActivity.this, BarsActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                startActivity(intent);
                finish();
                break;
            case 3:
                intent = new Intent(InfoActivity.this, RestaurantsActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                startActivity(intent);
                finish();
                break;
        }
    }
}