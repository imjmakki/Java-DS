package app.ds;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colorsUnmodified = List.of(
                "yellow",
                "brown"
        );

        List<String> colors = new ArrayList<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("Lightblue");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Black"));
        System.out.println(colors.contains("Green"));

        for(String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
