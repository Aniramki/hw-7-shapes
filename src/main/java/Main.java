package main.java;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Point p1 = new Point(20, 10);
        Point p2 = new Point(10, 5);
        Point p3 = new Point(30, 10);
        Point p4 = new Point(40, 10);

        System.out.println(p1.getName());

        Quad quad = new Quad(p3, p4);
        System.out.println(quad.getName());
        System.out.println(quad.getDistance());

        Circle circle = new Circle(p1, 10);
        System.out.println(circle.getName());
        System.out.println(circle.getLineColor(ColorShape.BLACK));
        System.out.println(circle.getArea());
        circle.setColorShape(ColorShape.TRANSPARENT);
        System.out.println(circle.getCenter().toString());
        System.out.println(circle.getColorShape());

        Rectangle rectangle = new Rectangle(p2, p3);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.replace(3, 5).toString());

        Line line = new Line(p1, p4);
        System.out.println(line.getName());
        System.out.println(line.сhangeSize(5));

        ShapesPrint shapePrinter = new ShapesPrint();
        Shapes shapes = new Quad(p3, p4);

        System.out.println(shapePrinter.print(shapes));
    }
}
