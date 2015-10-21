


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
        
        //The number of free minutes with each plan.
        double aDayFm = 100;
        double bDayFm = 250;
        
        //The user then inputs the amount of minutes they spend each day.
        System.out.print("Number of daytime minutes: ");
        double dayM = input.nextDouble();
        System.out.print("Number of evening minutes: ");
        double eveM = input.nextDouble();
        System.out.print("Number of weekend minutes: ");
        double weekM = input.nextDouble();
        
        //The costs are calculated through a couple of equations.
        //This equation is for plan A.
        double aDayC = (dayM - aDayFm) * 0.25;
        //if the the free minutes have not exceeded then the cost in the day will be 0.
        if(dayM < aDayFm){
            aDayC = 0.0;
        }
        double aEveC = eveM * 0.15;
        double aWeekC = weekM * 0.20;
        
        //This equation is for plan B
        double bDayC = (dayM - bDayFm) * 0.45;
        if (dayM < bDayFm){
            bDayC = 0.0;
        }
        double bEveC = eveM * 0.35;
        double bWeekC = weekM * 0.25;
        
        //The costs of each plan are added together and then revealed to the user.
        double aTotalC = aDayC + aEveC + aWeekC;
        System.out.println("Plan A costs: $" + aTotalC);
        double bTotalC = bDayC + bEveC + bWeekC;
        System.out.println("Plan B costs: $" + bTotalC);
        
        //The user is then told which plan cost less.
        if (aTotalC > bTotalC){
            System.out.println("Plan B is cheaper");
        }else if (aTotalC < bTotalC){
            System.out.println("Plan A is cheaper");
        }
        
        
        
                
    }
}
