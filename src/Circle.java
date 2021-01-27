public class Circle {

   private double radius;
   private static int count;

    public Circle() {
        radius = 1;
        count++;
    }

    public Circle(double r) {
        radius = r;
        count++;
    }

    public double computeCircumference() {
        return (Math.PI * 2 * radius);
    }

    public int getCount() {
        return count;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double computeArea() {
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args) {

    }
}
