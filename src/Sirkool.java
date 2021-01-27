public class Sirkool extends Geometric{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2.0 * this.radius * Math.PI;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getDiameter() {
        return radius * 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " \nRadius: " + this.getRadius() + " \nCircumference: " + this.getCircumference() + " \nArea: " + this.getArea();
    }
}
