package net.salesianos.menu;

public class Menu {
    public String ShowMenu() {
        String Menu = """
                Menu
                1.Añiadir restaurente.
                2.Editar restaurente.
                3. Mostrar restaurente.
                4.Eliminar restaurente.
                Q. salir.
                """;
        System.out.println(Menu);
        return Menu;
    }
}
