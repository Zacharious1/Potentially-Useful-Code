//Help Received: none
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1Total = 0;
        int player2Total = 0;
        int roundScore = 0;
        int currentRoll = 0;
        int initialRollP1 = (int) (1 + Math.random() * 6);
        int initialRollP2 = (int) (1 + Math.random() * 6);
        String temp = "2";
        char decision = temp.charAt(0);
        boolean player1Flag = true;

        System.out.println("Player 1 rolled a " + initialRollP1 + " to start, not bad!");
        System.out.println("Player 2 rolled a " + initialRollP2 + " to start, not bad!");

        do {
            if (initialRollP1 == 1) {
                player1Flag = false;
            }
            if (player1Flag) {
                while (player1Flag) {       //This is for player 1
                    System.out.print("Player 1, please press 1 to roll or press 2 to finish your turn: ");
                    temp = sc.nextLine();
                    decision = temp.charAt(0);
                    roundScore += initialRollP1;
                    initialRollP1 = 0;
                    if (decision == '2') {                      //This is if user decides to just keep the initial roll and not go again
                        player1Flag = false;
                        player1Total += roundScore;
                        System.out.println("You earned " + roundScore + " points this round, and your new total score is " + player1Total + ". Please press 1, \n then press enter and pass to player 2.");
                        roundScore = 0;
                        temp = sc.nextLine();
                        break;
                    } else if (decision == '1') {               //This is if user chooses to roll
                        currentRoll = ((int) (1 + Math.random() * 6));
                        if (currentRoll == 1) {
                            System.out.println("Sorry! You rolled a 1 and have not earned any points this round! Press 1 \n then press enter and pass to player 2 ");
                            roundScore = 0;
                            player1Flag = false;
                            temp = sc.nextLine();
                            break;
                        } else {
                            System.out.println("You rolled a " + currentRoll);
                            roundScore += currentRoll;
                            System.out.println("You earned " + roundScore + " this round, please press enter");
                        }
                    } else player1Flag = false;
                }
            }
            else {
                if (initialRollP2 == 1) {
                    player1Flag = true;
                    break;
                }
                while (!player1Flag) {          //This is for player 2
                    System.out.print("Player 2, please press 1 to roll or press 2 to finish your turn: ");
                    temp = sc.nextLine();
                    decision = temp.charAt(0);
                    roundScore += initialRollP2;
                    initialRollP2 = 0;
                    if (decision == '2') {                      //This is if user decides to just keep the initial roll and not go again
                        player1Flag = true;
                        player2Total += roundScore;
                        System.out.println("You earned " + roundScore + " points this round, and your new total score is " + player2Total + ". Please press 1, \n then press enter and pass back to player 1.");
                        roundScore = 0;
                        break;
                    } else if (decision == '1') {               //This is if user chooses to roll
                        currentRoll = ((int) (1 + Math.random() * 6));
                        if (currentRoll == 1) {
                            System.out.println("Sorry! You rolled a 1 and have not earned any points this round! \n Press 1, then press enter and pass back to player 1 ");
                            roundScore = 0;
                            player1Flag = true;
                            break;
                        } else {
                            System.out.println("You rolled a " + currentRoll);
                            roundScore += currentRoll;
                            System.out.println("You earned " + roundScore + " this round, please press enter");
                        }
                        temp = sc.nextLine();
                    } else player1Flag = true;
                }
            }
        } while (player1Total < 100 && player2Total < 100);
        System.out.println("Player 1 Score: " + player1Total);
        System.out.println("Player 2 Score: " + player2Total);
        if (player1Total >= 100) {
            System.out.println("Congratulations Player 1, You won the game! ");
            System.exit(0);
        }
        else if (player2Total >= 100) {
            System.out.println("Congratulations Player 2, You won the game! ");
            System.exit(0);
        }
    }
}
