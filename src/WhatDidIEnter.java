//Help Received: none
import java.util.Scanner;
public class WhatDidIEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if (a.length() > 1) {
            do {
                System.out.print("Error! You entered more than one character. Please enter only one character: ");
                a = sc.nextLine();
            } while (a.length() > 1);
        }

        char b = a.charAt(0);

        if (b >= 'A' && b <= 'Z') {
            System.out.print("Uppercase Letter");
        } else if (b >= 'a' && b <= 'z') {
            System.out.print("Lowercase Letter");
        } else if (b >= '0' && b <= '9') {
            System.out.print("Number");
        } else {
            System.out.print("Special Character");
        }







    }

}
