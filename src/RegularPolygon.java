//Help Received: none
class RegularPolygon {
    private int numberOfSides = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    public RegularPolygon() {

    }

    public RegularPolygon(int nOS, double sL) {
        numberOfSides = nOS;
        side = sL;
    }

    public RegularPolygon(int nOS, double sL, double xCord, double yCord) {
        numberOfSides = nOS;
        side = sL;
        x = xCord;
        y = yCord;
    }

    public double getSide() { return side; }

    public double getX() { return x; }

    public double getY() { return y; }

    public int getNumberOfSides() { return numberOfSides; }

    public void setSide(double s) { side = s; }

    public void setX(double xPoint) { x = xPoint; }

    public void setY(double yPoint) { y = yPoint; }

    public double getPerimeter() {
        int numSides = getNumberOfSides();
        double sideLength = getSide();
        return numSides * sideLength;
    }

    public double getArea() {
        int numSides = getNumberOfSides();
        double sideLength = getSide();
        return ((numSides * Math.pow(sideLength, 2.0))/ 4.0 * Math.tan((Math.PI)/numSides));
    }
}


