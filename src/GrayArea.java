public class GrayArea
{
    static double height = 10;
    static double width = 10;
    static double radius = 5;

    static double areaOfCircle;
    static double areaOfSquare;
    static double grayArea;

    public static void main(String[] args)
    {
        areaOfCircle = 3.14 * radius * radius;
        areaOfSquare = height * width;
        grayArea = areaOfSquare - areaOfCircle;

        System.out.println("The area of the gray section is " + grayArea);

    }
}