package com.example.humor.sincelejotour;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

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

    public static ArrayList<ListaActivity> hotelData (Context context){
        ArrayList<ListaActivity> data = new ArrayList<>();
        data.add(new ListaActivity(context.getString(R.string.hotel2),"Es lindi","Desde 100000",R.drawable.hotel_arawak));
    }

}
