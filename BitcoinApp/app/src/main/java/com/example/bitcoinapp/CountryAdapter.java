package com.example.bitcoinapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    List<Country> countries;

    public CountryAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_list, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = this.countries.get(position);
        holder.textCountrycode.setText("Countrycode : " + country.getCountrycode());
        holder.textCurrency.setText("Currency : " + country.getCurrency());
        holder.textSymbol.setText("Symbol : " + country.getSymbol());
        holder.textRate.setText("Rate : " + country.getRate());
        holder.textDescription.setText("Description : " + country.getDescription());
    }

    @Override
    public int getItemCount() {
        return this.countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textCountrycode, textCurrency,textSymbol,textRate,textDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textCountrycode = itemView.findViewById(R.id.textCountrycode);
            textCurrency = itemView.findViewById(R.id.textCurrency);
            textSymbol= itemView.findViewById(R.id.textSymbol);
            textRate = itemView.findViewById(R.id.textRate);
            textDescription = itemView.findViewById(R.id.textDescription);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
