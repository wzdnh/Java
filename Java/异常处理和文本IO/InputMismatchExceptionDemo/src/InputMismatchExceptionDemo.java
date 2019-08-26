/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author AI小政
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try {
                System.out.print("Enter an integer");
                int number = input.nextInt();
                System.out.println(
                    "The number entered is" + number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required )");
                input.nextLine();
            }
        }   
        while (continueInput);
        
    }
    
}
