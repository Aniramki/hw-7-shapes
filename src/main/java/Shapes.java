package main.java;

abstract public class Shapes implements FigureCenter, Resizable, RePlacable {
    protected Colored lineColor;
    protected ColorShape colorShape;

    public ColorShape getColorShape() {
        return colorShape;
    }

    public void setColorShape(ColorShape colorShape) {
        this.colorShape = colorShape;
    }


    //public void setLineColor(Colored lineColor) {
      //  this.lineColor = lineColor;


    public ColorShape getLineColor(ColorShape lineColor) {
        return  lineColor;
    }
    public abstract double getArea();

}
