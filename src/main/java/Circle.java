package main.java;

public class Circle extends Shapes {

    private Point center;

    private double radius;


    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public Point getCenter() {
        return center;
    }

   // public void setCenter(Point center) {
      //  this.center = center;
   // }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public ColorShape getLineColor(ColorShape lineColor) {
        return lineColor;
    }
    @Override
    public double сhangeSize(double changedX) {
        double L;
        return L = Math.PI * (radius + changedX) * 2;
    }
    @Override

    public Point replace (int replacedX, int replacedY) {

      Point replacedPoint = new Point(replacedX , replacedY);
      return center = replacedPoint;
    }
    @Override
    public ColorShape getColorShape() {
        return colorShape;
    }
    @Override
    public void setColorShape(ColorShape colorShape) {
        this.colorShape = colorShape;
    }



}
