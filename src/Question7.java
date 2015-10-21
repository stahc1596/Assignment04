


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //The user enters the speed limit.
        System.out.print("Enter speed limit: ");
        int speedlimit = input.nextInt();
        
        //The user enters the speed at which they were travelling at.
        System.out.print("Enter your speed: ");
        int speed = input.nextInt();
        
        //An equation calculates how much the user went over the speed limit if they did.
        int speedTotal = speed - speedlimit;
        
        //The fine is calculated through these codes.
        if (speedTotal > 1 && speedTotal <= 20){
            System.out.println("You are speeding and your fine is $100");
        }else if (speedTotal > 21 && speedTotal <= 30){
            System.out.println("You are speeding and your fine is $270");
        }else if (speedTotal > 31){
            System.out.println("You are speeding and your fine is $500");
        }else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
