/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationtwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class OperationTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner number = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean continueNumber = true;
        do {
            try {
                System.out.println("Please enter two number :");
                a = number.nextInt();
                b = number.nextInt();
                System.out.println("result is :" + a + b);
                continueNumber = false;
            }  
            catch (InputMismatchException ex) {
                    System.out.println("Try again :");
                    number.nextLine();  //用于退出循环
            } 
            
        }while(continueNumber);
    }
}
