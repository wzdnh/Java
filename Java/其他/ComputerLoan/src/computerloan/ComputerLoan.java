/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerloan;

/**
 *
 * @author 帅帅的阿政
 */
import java.util.Scanner;
public class ComputerLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate,e.g.,7.25%:" );
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer,e.g,5:");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount,e.g.,120000.95:");
        double loanAmount = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                -1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("The monthy payment is $" + 
                (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The monthly payment is $" +
                (int)(totalPayment ));
    }
    
}
