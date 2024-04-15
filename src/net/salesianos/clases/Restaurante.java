package net.salesianos.clases;

import java.util.ArrayList;

public class Restaurante {
    ArrayList<String> restaurant = new ArrayList<String>();
    private String restaurantName;
    private String localization;
    private String eschedual;
    private String puntation;

    public Restaurante(String restaurantName, String localization, String eschedual, String puntation) {
        this.restaurantName = restaurantName;
        this.localization = localization;
        this.eschedual = eschedual;
        this.puntation = puntation;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        restaurant.add(restaurantName);
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
        restaurant.add(localization);
    }

    public String getEschedual() {
        return eschedual;
    }

    public void setEschedual(String eschedual) {
        this.eschedual = eschedual;
        restaurant.add(eschedual);
    }

    public String getPuntation() {
        return puntation;
    }

    public void setPuntation(String puntation) {
        this.puntation = puntation;
        restaurant.add(puntation);
    }

}
