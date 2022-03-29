package app.ds;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
    }

    private static void maps() {
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
        map.remove(3);
        System.out.println();
        map.entrySet().forEach(System.out::println);
        System.out.println();
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println();
        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));
        System.out.println();
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println();
        System.out.println(map.values());
    }

    record Person(String name) {}
}
