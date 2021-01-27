//Help Received: classroom example
public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getName() + " is a staff member";
    }
}
