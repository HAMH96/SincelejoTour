package com.example.humor.sincelejotour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListaActivity extends AppCompatActivity {

    private String name;
    private String descrip;
    private String price;
    private int imageID;

    public ListaActivity(String name, String descrip, String price, int imageID) {
        this.name = name;
        this.descrip = descrip;
        this.price = price;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getPrice() {
        return price;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }
}
