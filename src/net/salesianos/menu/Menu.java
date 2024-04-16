package net.salesianos.menu;

import javax.swing.JOptionPane;

public class Menu {
    public String requestMenuOption() {
        String Menu = """
                menu
                1.Añiadir restaurente.
                2.Editar restaurente.
                3. Mostrar restaurente.
                4.Eliminar restaurente.
                Q. salir.
                """;
        return JOptionPane.showInputDialog(null, Menu, Menu, 0);
    
    }
}
