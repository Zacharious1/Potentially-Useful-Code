package Project2;

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String emailAddress;
    private String phoneNumber;

    public Customer() {}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
            this.address = address;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.contains("@")){
            this.emailAddress = emailAddress;
        } else System.out.print("Invalid Email!");

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Customer ID = " + customerID + " First name = " + firstName + " Last name = " + lastName + " Address = " + address + " Email Address = " + emailAddress + " Phone number = " + phoneNumber;
    }
}



