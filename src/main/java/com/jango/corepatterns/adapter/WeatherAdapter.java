package com.jango.corepatterns.adapter;

public class WeatherAdapter {
    public int findTempreature(int zipCode) {
        String city = null;
        if (zipCode == 042) {
            city = "Enugu";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        return finder.findCity(city);
    }
}
