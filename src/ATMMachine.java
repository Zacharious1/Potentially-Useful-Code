//Help Received: none
import java.util.Scanner;
public class ATMMachine {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = new Account(i, 100);
        int id;
        int selection;
        double withdraw;
        do {
            System.out.println("Enter a valid ID (0-9)");
            id = sc.nextInt();
        } while(id < 0 || id >= accounts.length);
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Enter new ID");
            System.out.println("5: Exit Program");
            do {
                System.out.println("Enter a valid selection (1-5)");
                selection = sc.nextInt();
            } while(selection < 1 || selection >= 6);

            if (selection == 1) {
                System.out.println("Current balance: " + accounts[id].getBalance());
            } else if (selection == 2) {
                System.out.println();
                System.out.print("Enter amount you wish to withdraw: ");
                withdraw = sc.nextDouble();
                if (withdraw > accounts[id].getBalance()) {
                    System.out.println();
                    System.out.print("Not enough money, please enter a valid amount to withdraw: ");
                    do {
                        withdraw = sc.nextDouble();
                    } while (withdraw > accounts[id].getBalance());
                } else {
                    accounts[id].setBalance(accounts[id].getBalance() - withdraw);
                    System.out.println("Your new balance is: " + accounts[id].getBalance());
                }
            } else if (selection == 3) {
                System.out.println();
                System.out.print("Enter the amount you wish to deposit: ");
                accounts[id].setBalance(accounts[id].getBalance() + sc.nextDouble());
                System.out.println("Your new balance is: " + accounts[id].getBalance());
            } else if (selection == 4){
                System.out.println("Please enter a new ID: " );
                do {
                    System.out.println("Enter a valid ID (0-9)");
                    id = sc.nextInt();
                } while(id < 0 || id >= accounts.length);
            } else{
                System.out.println("Thanks for playing!");
                System.exit(0);}
        }
    }
}
