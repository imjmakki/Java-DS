package app.ds;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ali"));
    }

    record Person(String name) {}
}
