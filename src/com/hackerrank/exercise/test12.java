package com.hackerrank.exercise;
import java.util.Scanner;


public class test12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double total = mealCost + mealCost*tipPercent*1.0/100.0 + mealCost*taxPercent*1.0/100.0;
        System.out.println(total);
        System.out.println(mealCost*tipPercent*1.0/100.0);
        System.out.println(mealCost*taxPercent*0.1/100.0);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
	}
}
