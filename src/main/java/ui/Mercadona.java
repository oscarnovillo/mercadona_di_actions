package ui;

import config.Configuracion;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Mercadona {

    public static void main(String[] args) {

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        UILoginMenu uiLoggedMenu;
        try (SeContainer container = initializer.initialize()) {

            uiLoggedMenu = container.select(UILoginMenu.class).get();
            uiLoggedMenu.loginMenu();

        }
    }

}
