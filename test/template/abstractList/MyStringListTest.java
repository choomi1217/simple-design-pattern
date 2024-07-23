package template.abstractList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringListTest {

    @Test
    void test(){
        String[] myList = {"a", "b", "c"};
        MyStringList myStringList = new MyStringList(myList);
        assertEquals("a", myStringList.get(0));
        assertEquals("b", myStringList.get(1));
        assertEquals("c", myStringList.get(2));
        assertEquals(3, myStringList.size());
        assertEquals("a", myStringList.set(0, "d"));
        assertEquals("d", myStringList.get(0));
    }

}