package Shapesss;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
//to make both width and length same
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
//to make both width and length the same
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return getLength() * getLength();
    }

    @Override
    public double getPerimeter() {
        return getLength() * 4;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide()
                + ", which is a subclass of " + super.toString();
    }
}
