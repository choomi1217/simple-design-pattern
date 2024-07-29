package proxy.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test() {
        Person joe = getPersomFromDatabase("Joe Javabean");
        Person ownerProxy = getOwnerProxy(joe);

        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Owner can't set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Non owner can't set interests from non owner proxy");
        }

        nonOwnerProxy.setGeekRating(8);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());

    }

    private Person getNonOwnerProxy(Person person) {
        return new NonOwnerInvocationHandler(person).getNonOwnerProxy(person);
    }

    Person getPersomFromDatabase(String name) {
        Person person = new PersonImpl();
        person.setName(name);
        person.setInterests("movies, music");
        person.setGeekRating(7);
        return person;
    }

    Person getOwnerProxy(Person person) {
        return new OwnerInvocationHandler(person).getOwnerProxy(person);
    }


}