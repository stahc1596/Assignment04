


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println();

        System.out.println("What was your test out of?");
        int test1Out = input.nextInt();
        System.out.println("What mark did you get?");
        int test1Mark = input.nextInt();
        System.out.println();

        System.out.println("What was your test out of?");
        int test2Out = input.nextInt();
        System.out.println("What mark did you get?");
        int test2Mark = input.nextInt();
        System.out.println();

        System.out.println("What was your test out of?");
        int test3Out = input.nextInt();
        System.out.println("What mark did you get?");
        int test3Mark = input.nextInt();
        System.out.println();

        System.out.println("What was your test out of?");
        int test4Out = input.nextInt();
        System.out.println("What mark did you get?");
        int test4Mark = input.nextInt();
        System.out.println();
        
        System.out.println("What was your test out of?");
        int test5Out = input.nextInt();
        System.out.println("What mark did you get?");
        int test5Mark = input.nextInt();
        System.out.println();

        System.out.println("Test scores for " + name);
        System.out.print("Test 1: ");
        double percent1 = test1Mark *100 / test1Out;
        System.out.println(percent1);
        System.out.print("Test 2: ");
        double percent2 = test2Mark * 100 / test2Out;
        System.out.println(percent2);
        System.out.print("Test 3: ");
        double percent3 = test3Mark * 100 / test3Out;
        System.out.println(percent3);
        System.out.print("Test 4:");
        double percent4 = test4Mark * 100 / test4Out;
        System.out.println(percent4);
        System.out.print("Test 5:");
        double percent5 = test5Mark * 100 / test5Out;
        System.out.println(percent5);
        
        double average = (percent1 + percent2 + percent3 + percent4 + percent5) / 5;
        System.out.println(average);
        
        input.close();

    }
}
