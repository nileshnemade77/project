package com.example.bitcoinapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CountryDbHelper extends SQLiteOpenHelper {
    private static final String DBNAME = "country_db";
    private static final int VERSION = 1;

    public CountryDbHelper(@Nullable Context context) {
        super(context, DBNAME, null, VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE countries(countrycode TEXT,currency TEXT,symbol TEXT,rate INTEGER,description TEXT)";
        sqLiteDatabase.execSQL(sql);

    }

    public void insertCountry(Country country){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("countrycode", country.getCountrycode());
        values.put("currency", country.getCurrency());
        values.put("symbol", country.getSymbol());
        values.put("rate", country.getRate());
        values.put("description", country.getDescription());
        db.insert("countries",null,values);
    }

    public List<Country> getCountry(){
        List<Country> countries = new ArrayList<>();
        SQLiteDatabase db =getReadableDatabase();
        Cursor cursor =  db.query("countries",null,null,null,null,null,null);
        while (cursor.moveToNext())
        {
            Country country = new Country(cursor.getString(0),cursor.getString(1),
                    cursor.getString(2),cursor.getInt(3),cursor.getString(4));
            countries.add(country);

        }
        return countries;
    }








    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
//    String countrycode;
//    int currency;
//    String symbol;
//    int rate;
//    String description;
