import java.util.ArrayList;

import net.salesianos.clases.Restaurante;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Restaurante> restaurants = new ArrayList<>();
        Restaurante juan = new Restaurante("casaJuan", "sitio", "si", 4.5f);
        restaurants.add(juan);
        
    }
}
