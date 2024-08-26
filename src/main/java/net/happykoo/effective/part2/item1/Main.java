package net.happykoo.effective.part2.item1;

import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance("happykoo", "seoul");

        //싱글톤
        Boolean.valueOf(true);

        Shape rectangle = Shape.newRectangle(5, 3);
        Shape circle = Shape.newCircle(3);

        System.out.println("circle area >>>> " + circle.area() + ", rectangle area >>> " + rectangle.area());
    }
}
