package com.example.bitcoinapp;

import java.io.Serializable;

public class Country implements Serializable {
    String countrycode;
    String currency;
    String symbol;
    int rate;
    String description;

    public Country() {

    }

    public Country(String countrycode, String currency, String symbol, int rate, String description) {
        this.countrycode = countrycode;
        this.currency = currency;
        this.symbol = symbol;
        this.rate = rate;
        this.description = description;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countrycode='" + countrycode + '\'' +
                ", currency=" + currency +
                ", symbol='" + symbol + '\'' +
                ", rate=" + rate +
                ", description='" + description + '\'' +
                '}';
    }
}
//Country code(code), Currency
//Symbol(symbol), Rate(rate), Description(description)