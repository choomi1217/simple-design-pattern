package iterator;

import iterator.restaurant2.Waitress;
import iterator.restaurant2.menu.CafeMenu;
import iterator.restaurant2.menu.DinerMenu;
import iterator.restaurant2.menu.PancakeHouseMenu;
import org.junit.jupiter.api.Test;

class RestaurantTest2 {

    @Test
    void test() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

        waitress.printMenu();
    }

}
