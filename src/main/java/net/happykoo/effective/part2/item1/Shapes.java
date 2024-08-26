package net.happykoo.effective.part2.item1;

public class Shapes {
    private Shapes() {}

    public static Shape newRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    public static Shape newCircle(double radius) {
        return new Circle(radius);
    }
}
