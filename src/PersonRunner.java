public class PersonRunner {
    public static void main(String[] args) {
        Person one = new Person();
        Student two = new Student();
        Staff three = new Staff();
        Faculty four = new Faculty();
        Employee five = new Employee();

        one.setName("one");
        two.setName("two");
        three.setName("three");
        four.setName("four");
        five.setName("five");

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(five.toString());
    }
}
