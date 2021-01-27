public class Course {
    private String courseCode;
    private String courseTitle;
    private int courseCredit;
    private Student[] classList;
    private Faculty instructor;

    public Course() {

    }

    public Course(String courseCode, String courseTitle, int courseCredit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public Student[] getClassList() {
        return classList;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setClassList(Student[] classList) {
        this.classList = classList;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course Code = " + this.courseCode + " Course Title = "
                + this.courseTitle + " Course Credit = " + this.courseCredit;
    }

    public static void addStudent(Student stu) {

    }
}
