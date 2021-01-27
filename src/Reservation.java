package Project2;

public class Reservation {
    private String customerID;
    private String roomName;
    private String dateOfRes;
    private boolean availability;
    private int periodResFor;
    private int cost;

    public String getCustomerID() {
        return customerID;
    }

    public int getCost() {
        return cost;
    }

    public int getPeriodResFor() {
        return periodResFor;
    }

    public String getDateOfRes() {
        return dateOfRes;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setDateOfRes(String dateOfRes) {
        this.dateOfRes = dateOfRes;
    }

    public void setPeriodResFor(int periodResFor) {
        this.periodResFor = periodResFor;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "Availability = " + this.availability + " Cost = " + this.cost
                + " Customer ID = " + this.customerID + " Date of Reservation = " + this.dateOfRes
                + " Period Reserved For = " + this.periodResFor + " Room Name = " + this.roomName;
    }
}

