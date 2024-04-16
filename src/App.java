import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import net.salesianos.clases.Restaurante;
import net.salesianos.menu.Menu;

public class App {
    static final Scanner KEYBOARD = new Scanner(System.in);
    static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();
    static final String mensaje = "";

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
                case "2":
                    editarRestaurante();
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

    public static void editarRestaurante() {

        for (int i = 0; i < RESTAURANTS.size(); i++) {

            String nameToEdit = JOptionPane.showInputDialog(null, "indica el nombre del restaurante a editar");

            if (nameToEdit.equals(RESTAURANTS.get(i).getRestaurantName())) {

                JOptionPane.showInputDialog(null, "indica el nuevo nombre del restaurant");
                RESTAURANTS.get(i).setRestaurantName(nameToEdit);

                String localizationToEdit = JOptionPane.showInputDialog(null, "introduzca la nueva localizacion");
                RESTAURANTS.get(i).setLocalization(localizationToEdit);

                String eschedualToEdit = JOptionPane.showInputDialog(null, "introduzca el nuevo horario");
                RESTAURANTS.get(i).setEschedual(eschedualToEdit);

                String puntutionToEdit = JOptionPane.showInputDialog(null, "indique la nueva puntuacion");
                float puntation = Float.parseFloat(puntutionToEdit);
                RESTAURANTS.get(i).setPuntation(puntation);

            } else {
                JOptionPane.showMessageDialog(null, "restaurante no valido");
                break;
            }
        }

    }
}
