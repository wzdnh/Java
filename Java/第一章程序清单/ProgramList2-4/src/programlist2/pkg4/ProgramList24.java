/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlist2.pkg4;

/**
 *
 * @author 帅帅的阿政
 */
import java.util.Scanner;

public class ProgramList24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number for radius :");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius +
                "is" + area);
        
    }
    
}
