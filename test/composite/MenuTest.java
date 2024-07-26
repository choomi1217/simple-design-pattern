package composite;

import org.junit.jupiter.api.Test;

class MenuTest {

    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent restaurantMenu = new Menu("RESTAURANT MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

    @Test
    public void testMenu() {
        allMenus.add(pancakeHouseMenu);
        allMenus.add(restaurantMenu);
        allMenus.add(cafeMenu);

        restaurantMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        restaurantMenu.add(new MenuItem("Steak", "A 12 oz. New York Strip, with a side of mashed potatoes and gravy", false, 15.99));
        restaurantMenu.add(new MenuItem("Salad", "A house salad with your choice of dressing", true, 1.99));
        restaurantMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 2.59));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes Breakfast", "Pancakes made with fresh blueberries", true, 3.49));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
        cafeMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}