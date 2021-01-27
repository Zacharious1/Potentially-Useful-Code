public class RektAngle extends Geometric{
    private double width;
    private double height;

    public RektAngle() {
        super();
        this.width = 1;
        this.height = 1;
    }

    public RektAngle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double computeArea() {
        return this.width * this.height;
    }

    public double computePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return super.toString() + " \nRectangle height: " + this.getHeight() + " \nRectangle Width: " + this.getWidth();
    }

    public static void main(String[] args) {
        Geometric ha = new RektAngle(20, 12, "Red", true);
        System.out.println(ha.toString());
    }
}
