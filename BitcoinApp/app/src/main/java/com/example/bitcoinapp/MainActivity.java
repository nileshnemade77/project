package com.example.bitcoinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Country> countries;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Countries");
        countries=new ArrayList<>();
        CountryDbHelper dbhelper=new CountryDbHelper(this);
        dbhelper.getCountry();
        //players.add(new Player("Sachin",45,"India","Cricket"));
        countries.add(new Country("111111","Doller","$",5000,"This is America"));
        countries=dbhelper.getCountry();
        CountryAdapter adapter= new CountryAdapter(countries);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void go(View view) {
        Intent intent=new Intent(this,AddCountry.class);
        startActivity(intent);
    }
}