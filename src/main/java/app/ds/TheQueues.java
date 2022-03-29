package app.ds;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Dan", 18));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addLast(new Person("Ali", 18));
        linkedList.addFirst(new Person("Ali", 11));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("MJ", 26));
        queue.add(new Person("Hassan", 20));
        queue.add(new Person("Nabeel", 19));
        queue.add(new Person("Ali", 11));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    static record Person(String name, int age) {}
}
