/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerchange;

/**
 *
 * @author 帅帅的阿政
 */
import java.util.Scanner;

public class ComputerChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter an amount in double,for example 11.56:");
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + "consists of");
        System.out.println("    " + numberOfOneDollars + "dollars");
        System.out.println("    " + numberOfQuarters + "quarters");
        System.out.println("    " + numberOfDimes + "dimes");
        System.out.println("    " + numberOfNickels + "nickls");
        System.out.println("    " + numberOfPennies + "pennies");
    }

}
