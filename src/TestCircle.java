public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle((int) (Math.random()* 12));
        Circle circle2 = new Circle((int) (Math.random()* 12));
        Circle circle3= new Circle((int) (Math.random()* 12));
        Circle circle4 = new Circle((int) (Math.random()* 12));
        Circle circle5 = new Circle((int) (Math.random()* 12));
        Circle circle6 = new Circle((int) (Math.random()* 12));
        Circle circle7 = new Circle((int) (Math.random()* 12));
        Circle circle8 = new Circle((int) (Math.random()* 12));
        Circle circle9 = new Circle((int) (Math.random()* 12));
        System.out.println("Radius = " +circle.getRadius());
        System.out.println("Radius = " +circle2.getRadius());
        System.out.println("Radius = " +circle3.getRadius());
        System.out.println("Radius = " +circle4.getRadius());
        System.out.println("Radius = " +circle5.getRadius());
        System.out.println("Radius = " +circle6.getRadius());
        System.out.println("Radius = " +circle7.getRadius());
        System.out.println("Radius = " +circle8.getRadius());
        System.out.println("Radius = " +circle9.getRadius());
        System.out.println("Count = " +circle.getCount());
    }
}
