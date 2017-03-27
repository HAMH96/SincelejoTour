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
        data.add(new ListaActivity(context.getString(R.string.hotel1),"Super lujoso","Desde 200000",R.drawable.hotel_malibu));
        data.add(new ListaActivity(context.getString(R.string.hotel3),"Bueno, bonito y barato","Desde 80000",R.drawable.hotel_panorama));
        return(data);
    }

    public static ArrayList<ListaActivity> barData (Context context){
        ArrayList<ListaActivity> data = new ArrayList<>();
        data.add(new ListaActivity(context.getString(R.string.bar1),"Es lindi","Desde 100000",R.drawable.kantaleta));
        data.add(new ListaActivity(context.getString(R.string.bar2),"Super lujoso","Desde 200000",R.drawable.wepaje));
        data.add(new ListaActivity(context.getString(R.string.bar3),"Bueno, bonito y barato","Desde 80000",R.drawable.ruta69));
        return(data);
    }

    public static ArrayList<ListaActivity> restautantData (Context context){
        ArrayList<ListaActivity> data = new ArrayList<>();
        data.add(new ListaActivity(context.getString(R.string.rest1),"Es lindi","Desde 100000",R.drawable.zaitun));
        data.add(new ListaActivity(context.getString(R.string.rest2),"Super lujoso","Desde 200000",R.drawable.arcanos));
        data.add(new ListaActivity(context.getString(R.string.rest3),"Bueno, bonito y barato","Desde 80000",R.drawable.cajita));
        return(data);
    }

}
