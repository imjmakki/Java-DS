package app.ds;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Green";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        colors[2] = "Red";
        System.out.println(Arrays.toString(colors));

        Integer[] number = {100, 250};

        for(Integer i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for(Integer i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        //Enhanced for loop
        for(String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
