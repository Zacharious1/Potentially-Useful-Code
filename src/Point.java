//Help Received: none
public class Point {
    private int x = 0;
    private int y = 0;

    public Point() {

    }

    Point(int xCord, int yCord) {
        x = xCord;
        y = yCord;
    }

    public void setX(int xCord) {
        x = xCord;
    }
    public void setY(int yCord) {
        y = yCord;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double[][] euclideanDistance(Point[] a) {
        double[] firstPoint = new double[2];
        double[] secondPoint = new double[2];
        double[] shortestDistance = {Math.sqrt((Math.pow((a[0].getX() - a[1].getX()), 2) + (Math.pow((a[0].getY() - a[1].getY()), 2))))};
        for (int i = 1; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++) {
                double distance = Math.sqrt((Math.pow((a[i].getX() - a[j].getX()), 2) + (Math.pow((a[i].getY() - a[j].getY()), 2))));
                if (distance < shortestDistance[0]) {
                    shortestDistance[0] = distance;
                    firstPoint[0] = a[i].getX();
                    firstPoint[1] = a[i].getY();
                    secondPoint[0] = a[j].getX();
                    secondPoint[1] = a[j].getY();
                }
            }
        double[][] doubles = {firstPoint, secondPoint, shortestDistance};
        return doubles;
    }

}
