package app.ds;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("MJ", 26));
        supermarket.add(new Person("Hassan", 20));
        supermarket.add(new Person("Nabeel", 19));
        supermarket.add(new Person("Ali", 11));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }

    static record Person(String name, int age) {}
}
