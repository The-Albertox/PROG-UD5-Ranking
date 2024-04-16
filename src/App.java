import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import net.salesianos.clases.Restaurante;
import net.salesianos.menu.Menu;

public class App {
    static final Scanner KEYBOARD = new Scanner(System.in);
    static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();


    public static void main(String[] args) throws Exception {

        boolean salir = true;
        String option = "";

        Menu menu = new Menu();
        while (salir) {
            option = menu.requestMenuOption();
            switch (option) {
                case "1":
                    aniadirRestaurante();
                    break;
                case"2":

                default:
                    break;
            }
        }
    }

    public static void aniadirRestaurante() {

        String name = JOptionPane.showInputDialog(null, "introduzca el nombre ");

        String localization = JOptionPane.showInputDialog(null, "introduzca la localizcacion");

        String eschedual = JOptionPane.showInputDialog(null, "introduzca el hotario");

        String puntuacionText = JOptionPane.showInputDialog(null, "introduzca la puntuacion", null);
        float puntation = Float.parseFloat(puntuacionText);

        Restaurante restaurante = new Restaurante(name, localization, eschedual, puntation);
        RESTAURANTS.add(restaurante);

        
    }
}
