//Help Received: none
public class PointTester {
    public static void main(String[] args) {
        Point[] points = new Point[15];
        for (int i = 0; i < points.length; i++) {
            int a = 1 + (int) (Math.random() * 10);
            int b = (int) (Math.random() * 13);
            points[i] = new Point(a, b);
            System.out.println(points[i].getX() + " " + points[i].getY());
        }
        System.out.println();
        printMatrix(Point.euclideanDistance(points));
    }

    private static void printMatrix(double[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
