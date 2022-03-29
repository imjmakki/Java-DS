package app.ds;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Brown"));
        balls.add(new Ball("Grey"));
    }

    record Ball(String color) {}
}
