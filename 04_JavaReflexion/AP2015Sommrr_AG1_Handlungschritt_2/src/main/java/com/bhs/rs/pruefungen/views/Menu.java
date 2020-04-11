package com.bhs.rs.pruefungen.Views;

import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Created by JAbanto on 15.01.2018.
 */
public class Menu {

        private static final String QUIT_KEY = "e";

        private final SortedMap<String, MenuItem> menuItems = new TreeMap<>();

        private final MenuItem quitItem ;

        private boolean continueLoop = true;

        private final String title;

        /**
         * Creates the menu using the supplied context and menu items.
         *
         * @param title     com.bhs.rs.pruefungen.Views.Menu Title
         * @param context   context
         *
            this.menuItems.put(QUIT_KEY, quitItem);
        }

        /**
         * Does a traditional com.bhs.rs.pruefungen.Views.Menu/Input/Action loop key defined in {@link Menu#QUIT_KEY} is entered to quit.
         */
        public Menu(String title, MenuItem... menuItems) {
            this.title = title;
            Integer counter = 0;
            for (MenuItem menuItem : menuItems) {
                this.menuItems.put((counter++).toString(), menuItem);
            }

            quitItem = new MenuItem("Exit",null);
            this.menuItems.put(QUIT_KEY, quitItem);
        }



        public void doLoop() {
            continueLoop = true;
            ViewTools.clearScreen();
            while (continueLoop) {
                printMenu();
                readInput();
            }
        }

        private void readInput() {
            String key = ViewTools.readInput(" Enter a number or '" + QUIT_KEY + "' for quit, then press [ENTER]\n\n").toLowerCase();
            ViewTools.output("Processing input...");
            ViewTools.clearScreen();
            MenuItem menuItem = getMenuItemFor(key);

            if (menuItem != null) {
                if (menuItem == quitItem) {
                    ViewTools.output("Exiting Application...");
                    continueLoop = false;
                } else {
                    ViewTools.outputHeader(menuItem.getName());
                    ViewTools.newLine();
                    menuItem.execute();
                    ViewTools.clearScreen();
                }
            }
        }

        private MenuItem getMenuItemFor(String key) {
            return menuItems.get(key);
        }

        private void printMenu() {
            ViewTools.outputHeader(title);
            ViewTools.newLine();
            menuItems.forEach((key, menuItem) -> ViewTools.output(" " + key + " - " + menuItem.getName()));
            ViewTools.newLine();
        }


}
