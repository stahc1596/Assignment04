


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int tickets = 35;
        System.out.println("How many tickets would the prom commitee need to sell in order ");
        System.out.println("to pay for everything, the tickets cost 35$. What do all these ");
        System.out.println("items cost?");
        //computer asks user the cost of everything
        System.out.print("DJ = ");
        int dj = input.nextInt();
        System.out.print("Food = ");
        int food = input.nextInt();
        System.out.print("Renting a hall = ");
        int hall = input.nextInt();
        System.out.print("Decorations = ");
        int dec = input.nextInt();
        System.out.print("Staff = ");
        int staff = input.nextInt();
        System.out.print("Misc. = ");
        int misc = input.nextInt();
        //user tells computer the cost of everything
        int totalD = dj + food + hall + dec + staff + misc;
        int totalT = (dj + food + hall + dec + staff + misc) / 35;
        // the math of all the expenses including total cost of everything and tickets
        //needed to sell
        System.out.println("All of the expense come to " + totalD + " and");
        System.out.println("with the cost of all these items, the prom commitee will");
        //computer tells you all the info needed
        System.out.println(" need to sell " + totalT + " tickets.");

        input.close();


    }
}
