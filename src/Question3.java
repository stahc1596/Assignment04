

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter four numbers");
        //computer asks you for four numbers
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        //user tells computer four numbers
        System.out.println("Your numbers were " + n1 + ", " + n2 + ", " + n3 + ", and " + n4);
        //four numbers are then shown on one line

        input.close();


    }
}
