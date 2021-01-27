//Help Received: none
public class RegularPolygonApplication {
    public static void main(String[] args) {
        RegularPolygon noArgs = new RegularPolygon();
        RegularPolygon twoArgs = new RegularPolygon(6, 4);
        RegularPolygon fourArgs = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("noArgs has a perimeter of " + noArgs.getPerimeter() + " and an area of " + noArgs.getArea());
        System.out.println("twoArgs has a perimeter of " + twoArgs.getPerimeter() + " and an area of " + twoArgs.getArea());
        System.out.println("fourArgs has a perimeter of " + fourArgs.getPerimeter() + " and an area of " + fourArgs.getArea());
    }
}
