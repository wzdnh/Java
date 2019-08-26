/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanexception;

/**
 *
 * @author AI小政
 */
public class IllegalArgumentException extends Exception {
    private double loanAmount;
    private double annualInterestrate;
    private int numberOfYears;

    public IllegalArgumentException(double loanAmount) {
        super("Invalid number ");
        this.loanAmount = loanAmount;
        
    }
    
    public IllegalArgumentException(int numberOfYears){
        super("Invalid  umberOfYears " + numberOfYears);
        this.numberOfYears = numberOfYears;
    }
    
    public IllegalArgumentException(double annualInterestrate){
        super("Invalid annualInterestrate " + annualInterestrate);
        this.annualInterestrate = annualInterestrate;
    }
    
    
    

    IllegalArgumentException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
    public double getAnnualInterestrate(){
        return annualInterestrate;
    }
    
    public int getNumberOfYears(){
        return numberOfYears;
    }
}
