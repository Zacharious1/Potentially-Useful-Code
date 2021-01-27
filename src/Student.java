//Help Received: classroom example
public class Student extends Person{
    private static String classStatus;

    public Student() {

    }
    public static String getClassStatus() {
        return classStatus;
    }

    public static void setClassStatus(String classStatus) {
        Student.classStatus = classStatus;

    }

    @Override
    public String toString() {
        return this.getName() + " is a student";
    }
}
