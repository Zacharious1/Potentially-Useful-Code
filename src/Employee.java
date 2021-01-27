//Help Received: classroom example
public class Employee extends Person {
    private MyDate dateHired;
    private double salary;
    private String officeNumber;

    public Employee(String name, String address, String phoneNumber, String email, MyDate dateHired, double salary, String officeNumber) {
        super(name, address, phoneNumber, email);
        this.dateHired = dateHired;
        this.salary = salary;
        this.officeNumber = officeNumber;
    }

    public Employee() {

    }
    public double getSalary() {
        return salary;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return this.getName() + " is an employee";
    }
}
