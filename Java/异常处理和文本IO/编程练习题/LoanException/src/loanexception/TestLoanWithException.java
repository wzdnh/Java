/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanexception;

import java.util.Scanner;

/**
 *
 * @author AI小政
 */

public class TestLoanWithException {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three number :");
        double newAnnualInterestrate = input.nextDouble();
        int newNumberOfYears = input.nextInt();
        double newLoanAmount = input.nextDouble();

        
        try {
            
            LoanWithException c1 = new LoanWithException(newAnnualInterestrate, newNumberOfYears, newLoanAmount);
            
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        } 
    }
}
    
    class LoanWithException{
        private double loanAmount;
        private double annualInterestrate;
        private int numberOfYears; 
        private java.util.Date loanDate;
        
        public LoanWithException() throws IllegalArgumentException {
            this(2.5, 1, 1000);
        } 
    
    
        public LoanWithException(double newAnnualInterestrate, int newNumberOfYears, double newLoanAmount) throws IllegalArgumentException {
            setAnnualInterestrate(newAnnualInterestrate);
            setNumberOfYears(newNumberOfYears);
            setLoanAmount(newLoanAmount);
            loanDate = new java.util.Date();
        } 

        public double getAnnualInterestrate(){
            return annualInterestrate;
        }

        public void setAnnualInterestrate(double newAnnualInterestrate) throws IllegalArgumentException{
            if (annualInterestrate > 0)
                annualInterestrate = newAnnualInterestrate;
            else
                throw new IllegalArgumentException();
        }

        public int getNumberOfYears(){
            return numberOfYears;
        }

        public void setNumberOfYears(int newNumberOfYears) throws IllegalArgumentException{
            if (numberOfYears > 0)
                numberOfYears = newNumberOfYears;
            else
                throw new IllegalArgumentException(newNumberOfYears);

        }

        public double getLoanAmount(){
            return loanAmount;
        }

        public void setLoanAmount(double newLoanAmount) throws IllegalArgumentException{
            if (loanAmount > 0)
                loanAmount = newLoanAmount;
            else
                throw new LoanException(newLoanAmount);
        }

        public double getMonthlyPayment(){
            double monthlyInterestRate = annualInterestrate / 12000;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }

        public double getTotalPayment(){
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }

        public java.util.Date getLoanDate() {
            return loanDate;
        }
        
}
    
  
