package Project2;

import java.util.Scanner;

public class Database {
    private Customer[] customers;
    private Reservation[] reservations;
    private static Scanner sc = new Scanner(System.in);

    public static void newCustomer(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                Customer a = new Customer();
                System.out.println("Enter Address: ");
                a.setAddress(sc.nextLine());
                System.out.println("Enter Customer ID: ");
                a.setCustomerID(sc.nextLine());
                System.out.println("Enter Email Address: ");
                a.setEmailAddress(sc.nextLine());
                System.out.println("Enter First Name: ");
                a.setFirstName(sc.nextLine());
                System.out.println("Enter Last Name: ");
                a.setLastName(sc.nextLine());
                System.out.println("Enter Phone Number: ");
                a.setPhoneNumber(sc.nextLine());
                customers[i] = a;
                break;
            }
            else if (i == customers.length - 1){
                System.out.print("No more spaces for guests!");
                break;
            }
        }
    }

    public static void newReservation(Reservation[] reservations) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                Reservation a = new Reservation();
                a.setAvailability(false);
                System.out.println("Enter cost: ");
                a.setCost(sc.nextInt());
                System.out.println("Enter Customer ID: ");
                a.setCustomerID(sc.nextLine());
                System.out.println("Enter the date reserved for: ");
                a.setDateOfRes(sc.nextLine());
                System.out.println("Enter the duration of the guest's stay: ");
                a.setPeriodResFor(sc.nextInt());
                System.out.println("Enter the room name: ");
                a.setRoomName(sc.nextLine());
                reservations[i] = a;
                break;
            }
            else if (i == reservations.length - 1){
                System.out.print("No more rooms for guests!");
                break;
            }
        }
    }

    public static void deleteCustomer(Customer[] customers, Reservation[] reservations, String customerID) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null)
                if (customerID.equals(customers[i].getCustomerID()))
                    customers[i] = null;
        }


        for (int j = 0; j < reservations.length; j++) {
            if (reservations[j] != null)
                if (customerID.equals(reservations[j].getCustomerID()))
                    reservations[j] = null;
        }
    }

    public static void updateCustomer(Customer[] customers, Reservation[] reservations, String customerID) {
        for (int i = 0; i < customers.length; i++) {
            if (customerID.equals(customers[i].getCustomerID()))
                customers[i] = null;
            Customer a = new Customer();
            System.out.println("Enter Address: ");
            a.setAddress(sc.nextLine());
            System.out.println("Enter Customer ID: ");
            a.setCustomerID(sc.nextLine());
            System.out.println("Enter Email Address: ");
            a.setEmailAddress(sc.nextLine());
            System.out.println("Enter First Name: ");
            a.setFirstName(sc.nextLine());
            System.out.println("Enter Last Name: ");
            a.setLastName(sc.nextLine());
            System.out.println("Enter Phone Number: ");
            a.setPhoneNumber(sc.nextLine());
            customers[i] = a;
            for (int j = 0; j < reservations.length; j++)
                reservations[j].setCustomerID(a.getCustomerID());
        }
    }
    public static void updateReservation(Reservation[] reservations, String customerID) {
        for (int i = 0; i < reservations.length; i++) {
            if (customerID.equals(reservations[i].getCustomerID()))
                reservations[i] = null;
            Reservation a = new Reservation();
            a.setAvailability(false);
            System.out.println("Enter Customer ID: ");
            a.setCustomerID(sc.nextLine());
            System.out.println("Enter room name: ");
            a.setRoomName(sc.nextLine());
            System.out.println("Enter the duration of the guest's stay: ");
            a.setPeriodResFor(sc.nextInt());
            System.out.println("Enter the date the room is reserved for: ");
            a.setDateOfRes(sc.nextLine());
            System.out.println("Enter cost: ");
            a.setCost(sc.nextInt());
            reservations[i] = a;
        }
    }

    public static void deleteReservation(Reservation[] reservations, String customerID) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] != null)
                if (customerID.equals(reservations[i].getCustomerID()))
                    reservations[i] = null;
        }
    }

    public static void printReservations(Reservation[] reservations) {
        for (int i = 0; i < reservations.length; i++)
            System.out.println(reservations[i].toString());
    }

    public static void printCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());
    }
}

