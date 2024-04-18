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
                case "2":
                    editarRestaurante();
                    break;
                case "3":
                    mostrarRestaurante();
                    break;
                case "4":
                    eliminarRestaurante();
                    break;
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

    public static void mostrarRestaurante() {
        String mensaje = "";
        Restaurante ordenRestaurante;

        for (int i = 0; i < RESTAURANTS.size(); i++) {
            for (int j = 0; j < RESTAURANTS.size() - 1; j++) {
                if (RESTAURANTS.get(j + 1).getPuntation() > RESTAURANTS.get(j).getPuntation()) {
                    ordenRestaurante = RESTAURANTS.get(j + 1);
                    RESTAURANTS.set(j + 1, RESTAURANTS.get(j));
                    RESTAURANTS.set(j, ordenRestaurante);
                }
            }
        }
        for (int i = 0; i < RESTAURANTS.size(); i++) {
            mensaje = RESTAURANTS.get(i).toString();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public static void eliminarRestaurante() {
        for (int i = 0; i < RESTAURANTS.size(); i++) {
            String nameToDelete = JOptionPane.showInputDialog(null, "indica el nombre del restaurante a eliminar");
            if (nameToDelete.equals(RESTAURANTS.get(i).getRestaurantName())) {
                RESTAURANTS.remove(i).setRestaurantName(null);
            }
        }
    }
}
