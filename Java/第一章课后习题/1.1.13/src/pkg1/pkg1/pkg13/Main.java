/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1.pkg13;

/**
 *
 * @author 帅帅的阿政
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         System.out.print("Please inpt valu for a b c d e f :");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
         double e = input.nextDouble();
         double f = input.nextDouble();
         double x = (e * d - b * f) / (a * d - b * c);
         double y = (a * f - e * c) / (a * d - b * c);
         System.out.println("The x value is :" + x);
         System.out.println("The y value is :" + y);
        
    }
    
}
