public class Rectangle {
    private double breadth;
    private double length;

    double getlength() {
        return length;
    }

    double getbreadth() {
        return breadth;
    }

    double getArea() {
        return breadth * length;
    }
    double getPerimeter() {
        return ((breadth * 2.0) + (length * 2.0));
    }

    public void setbreadth(double b) {
        breadth = b;
    }

    public void setlength(double l) {
        length = l;
    }

    Rectangle(double b, double l) {
        length = l;
        breadth = b;
    }

    public String toString() {
        return "length = " + length + " breadth = " + breadth + " perimeter = " + getPerimeter();
    }
}
