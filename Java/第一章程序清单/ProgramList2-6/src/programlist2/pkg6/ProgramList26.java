/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlist2.pkg6;

/**
 *
 * @author 帅帅的阿政
 */
import java.util.Scanner;


public class ProgramList26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for fahrenheit :");
        double fahrenheit = input.nextDouble();
        double celsius = 5.0 / 9 * (fahrenheit - 32);
        System.out.println("fahrenheit " + fahrenheit + " is " +
                 celsius + " in celsius");
        
    }
    
}
