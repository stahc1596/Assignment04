


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int player1 = 1;
        int player2 = 1;
        int turn = 1;

        while (player1 != 100 && player2 != 100) {
            
            if (turn == 1){
                System.out.println("It is now player ones turn.");
            }else if (turn == 2){
                System.out.println("It is now player twos turn.");
            }
            System.out.print("Enter sum of dice: ");
            int roll = input.nextInt();
            while (roll > 12 || roll < 2) {
                System.out.println("That is not a roll, please try again.");
                roll = input.nextInt();
            }
            int position = 0;
            if (turn == 1) {
                player1 = player1 + roll;
                position = player1;
            }else if(turn == 2){
                player2 = player2 + roll;
                position = player2;
            }
            
            if (position == 54) {
                position = 19;
                
                System.out.println("Whoops, you hit a snake.");
            } else if (position == 90) {
                position = 48;
                
                System.out.println("Whoops, you hit a snake.");
            } else if (position == 99) {
                position = 77;
                
                System.out.println("Whoops, you hit a snake.");
            } else if (position == 9) {
                position = 34;
                
                System.out.println("Hooray! You hit a ladder!");
            } else if (position == 40) {
                position = 64;
                
                System.out.println("Hooray! You hit a ladder!");
            } else if (position == 67) {
                position = 86;
                
                System.out.println("Hooray! You hit a ladder!");
            }
            if (position > 100) {
                int goBack = (position - 100) * 2;
                position = position - goBack;
                System.out.println("Whoops too much, go back " + goBack);
            }
            if (turn == 1){
                player1 = position;
                System.out.println("You are now on " + player1);
                System.out.println();
                turn = turn + 1;
            }else if (turn == 2){
                player2 = position;
                System.out.println("You are now on " + player2);
                System.out.println();
                turn = turn - 1;
            }
        }
        System.out.println("Congratulations! You Win!");

    }
}
