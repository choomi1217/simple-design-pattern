package template.caffeine;

import org.junit.jupiter.api.Test;

class CaffeineBeverageTest {

    @Test
    void prepareRecipe() {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }

}