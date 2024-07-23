package iterator.restaurant2;

import iterator.restaurant2.menu.Menu;
import iterator.restaurant2.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    private final Menu dinerMenu;
    private final Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.name() + ", ");
            System.out.print(menuItem.price() + " -- ");
            System.out.println(menuItem.description());
        }
    }

}
