package app.ds;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
    }

    record Person(String name) {}
}
