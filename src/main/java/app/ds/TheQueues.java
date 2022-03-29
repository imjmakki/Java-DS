package app.ds;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("MJ", 26));
        supermarket.add(new Person("Hassan", 20));
        supermarket.add(new Person("Nabeel", 19));
    }
    static record Person(String name, int age) {

    }
}
