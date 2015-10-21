


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double aDayFm = 100;
        double bDayFm = 250;
        System.out.print("Number of daytime minutes: ");
        double dayM = input.nextDouble();
        System.out.print("Number of evening minutes: ");
        double eveM = input.nextDouble();
        System.out.print("Number of weekend minutes: ");
        double weekM = input.nextDouble();
        
        double aDayC = (dayM - aDayFm) * 0.25;
        if(dayM < aDayFm){
            aDayC = 0.0;
        }
        double aEveC = eveM * 0.15;
        double aWeekC = weekM * 0.20;
        
        double bDayC = (dayM - bDayFm) * 0.45;
        if (dayM < bDayFm){
            bDayC = 0.0;
        }
        double bEveC = eveM * 0.35;
        double bWeekC = weekM * 0.25;
        
        double aTotalC = aDayC + aEveC + aWeekC;
        System.out.println("Plan A costs: $" + aTotalC);
        double bTotalC = bDayC + bEveC + bWeekC;
        System.out.println("Plan B costs: $" + bTotalC);
        
        if (aTotalC > bTotalC){
            System.out.println("Plan B is cheaper");
        }else if (aTotalC < bTotalC){
            System.out.println("Plan A is cheaper");
        }
        
        
        
                
    }
}
