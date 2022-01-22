package main.java;

public class Rectangle extends Shapes{
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }
    public double getDistance() {

        double distance = Math.sqrt((secondPoint.getX() - firstPoint.getX()) * (secondPoint.getX() - firstPoint.getX()) + (secondPoint.getY() - firstPoint.getY()) * (secondPoint.getY() - firstPoint.getY()));

        return distance;/*diagonal*/
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return (secondPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY());
    }

    @Override
    public Point getCenter() { /*diagonal center*/
        int centerX =  (secondPoint.getX() + firstPoint.getX()) / 2;
        int centerY = (secondPoint.getY() + firstPoint.getY()) / 2;

        return  new Point(centerX , centerY);
    }
    public ColorShape getLineColor(ColorShape lineColor) {
        return  lineColor;}
    @Override
    public double сhangeSize(double changedX) {
        double L;
        return L = getDistance() + changedX;
    }
    @Override

    public Point replace (int replacedX, int replacedY) {

        return  new Point(replacedX , replacedY);
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
