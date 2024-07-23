package iterator;

import iterator.restaurant.Waitress;
import iterator.restaurant.menu.DinerMenu;
import iterator.restaurant.menu.PancakeHouseMenu;
import org.junit.jupiter.api.Test;

class RestaurantTest {

    @Test
    void test() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();
    }



}