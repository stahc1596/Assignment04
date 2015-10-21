

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        //computer asks your name
        String name = input.nextLine();
        //Tell the computer your name
        System.out.println("Hello " + name + ". How are you today?");
        //computer greets you with your name

        input.close();
    }
}
