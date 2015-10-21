


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Player 1 starts on square 1.
        int player1 = 1;
        
        //This statement repeats until player one reaches square 100.
        while (player1 != 100){
            
            //The player then rolls the dice and enters what the sum of the dice were.
            System.out.print("Enter sum of dice: ");
            int roll = input.nextInt();
            while (roll > 12 || roll < 2){
                System.out.println("That is not a roll, please try again.");
                roll = input.nextInt();}
            
            //The player then moves the amount they rolled
            player1 = player1 + roll;
            
            //If the player lands on a snake or a ladder, they will move to a different spot
            //that corresponds to the snake/ladder.
            if (player1 == 54){
                player1 = 19;
                System.out.println("Whoops, you hit a snake.");
            }else if (player1 == 90){
                player1 = 48;
                System.out.println("Whoops, you hit a snake.");
            }else if (player1 == 99){
                player1 = 77;
                System.out.println("Whoops, you hit a snake.");
            }else if (player1 == 9){
                player1 = 34;
                System.out.println("Hooray! You hit a ladder!");
            }else if (player1 == 40){
                player1 = 64;
                System.out.println("Hooray! You hit a ladder!");
            }else if (player1 == 67){
                player1 = 86;
                System.out.println("Hooray! You hit a ladder!");
                
                //If the player went over 100, they then move back the remaining spaces.
            }if (player1 > 100){
                int goBack = (player1 - 100)*2;
                player1 = player1 - goBack;
                System.out.println("Whoops too much, go back " + goBack);
            }
            
            //This statement explains what square you are on.
            System.out.println("You are now on " + player1);
        }
        //If you won the game, you are then presented with a congratulations.
        System.out.println("Congratulations! You Win!");
        
        
    }
}
