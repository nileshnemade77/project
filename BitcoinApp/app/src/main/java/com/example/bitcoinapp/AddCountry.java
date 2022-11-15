package com.example.bitcoinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCountry extends AppCompatActivity {
    EditText editCountrycode,editCurrency,editSymbol,editRate,editDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_country);
        getSupportActionBar().setTitle("Add Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        editCountrycode = findViewById(R.id.editCountrycode);
        editCurrency = findViewById(R.id.editCurrency);
        editSymbol = findViewById(R.id.editSymbol);
        editRate = findViewById(R.id.editRate);
        editDescription = findViewById(R.id.editDescription);
    }

    public void add(View view) {
        Country country=new Country(editCountrycode.getText().toString(),editCurrency.getText().toString()
                ,editSymbol.getText().toString(),Integer.parseInt(editRate .getText().toString()),editDescription.getText().toString()
        );
        CountryDbHelper dbhelper=new CountryDbHelper(this);
        dbhelper.insertCountry(country);
        finish();

    }

    public void cancel(View view) {
finish();

    }
}