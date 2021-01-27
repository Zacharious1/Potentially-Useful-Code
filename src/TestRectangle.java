public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] test = createRectangles(10);
        double sum = sumRectanglePerimeters(test);
        System.out.println(sum);
    }
    public static Rectangle[] createRectangles(int n) {
        Rectangle[] test = new Rectangle[n];
        for (int i = 0; i < n; i++)
            test[i] = new Rectangle((1 + Math.random()* 10), (1 + Math.random()* 10));
        return test;
    }

    public static void toString(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++)
            System.out.println(rectangles[i].toString());
    }

    public static double sumRectanglePerimeters(Rectangle[] r) {
        double sum = 0.0;
        for (int i = 0; i < r.length; i++)
            sum += r[i].getPerimeter();
        return sum;
    }
}
