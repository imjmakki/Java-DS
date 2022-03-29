package app.ds;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
    }

    record Ball(String color) {}
}
