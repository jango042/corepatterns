package com.jango.corepatterns.adapter;

public class WeatherUi {
    public void showTemprature(int zipCode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTempreature(zipCode));
    }

    public static void main(String[] args) {
        WeatherUi ui = new WeatherUi();
        ui.showTemprature(042);
    }
}
