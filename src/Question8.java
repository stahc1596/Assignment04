


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
        
        int player1 = 1;
        
        while (player1 != 100){
            System.out.print("Enter sum of dice: ");
            int roll = input.nextInt();
            while (roll > 12 || roll < 2){
                System.out.println("That is not a roll, please try again.");
                roll = input.nextInt();}
            player1 = player1 + roll;
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
            }if (player1 > 100){
                int goBack = (player1 - 100)*2;
                player1 = player1 - goBack;
                System.out.println("Whoops too much, go back " + goBack);
            }
            System.out.println("You are now on " + player1);
        }
        System.out.println("Congratulations! You Win!");
        
        
    }
}
