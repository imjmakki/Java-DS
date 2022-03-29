package app.ds;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ali"));
        map.put(2, new Person("Alex"));
        map.put(3, new Person("Eli"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.entrySet().forEach(System.out::println);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }

    record Person(String name) {}
}
