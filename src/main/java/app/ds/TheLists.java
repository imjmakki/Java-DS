package app.ds;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("Lightblue");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Black"));
        System.out.println(colors.contains("Green"));
    }
}
