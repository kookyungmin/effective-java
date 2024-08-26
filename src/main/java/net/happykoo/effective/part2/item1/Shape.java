package net.happykoo.effective.part2.item1;

public interface Shape {
    double area();
    static Shape newRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    static Shape newCircle(double radius) {
        return new Circle(radius);
    }
}
