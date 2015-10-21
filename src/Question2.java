

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the measurement in inches you wish to convert to cm: ");
        //computer asks for a measurement in inches
        double inches = input.nextDouble();
        //tell the computer your measurement
        double cm = 0;
        //this is the cm variable, it's nothing special yet
        cm = inches;
        //cm currently equals inches
        cm = cm * 2.54;
        //cm are times by 2.54 to get the actual value of cm
        System.out.println(inches + " inche(s) is the same as " + cm + " cm.");
        //computer tells you what your measurement is in cm

        input.close();
    }
}
