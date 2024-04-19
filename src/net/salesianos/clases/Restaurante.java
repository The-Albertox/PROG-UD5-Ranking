package net.salesianos.clases;


public class Restaurante {
    private String restaurantName;
    private String localization;
    private String eschedual;
    private float puntation;

    public Restaurante(String restaurantName, String localization, String eschedual, float puntation) {
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

    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;

    }

    public String getEschedual() {
        return eschedual;
    }

    public void setEschedual(String eschedual) {
        this.eschedual = eschedual;

    }

    public float getPuntation() {
        return puntation;
    }

    public void setPuntation(float puntation) {
        this.puntation = puntation;
    }

    @Override
    public String toString() {
        return "nombre" + restaurantName + "\n localizacion " + localization + " \n horario " + eschedual + "\n puntuacion" + puntation;
    }

}
