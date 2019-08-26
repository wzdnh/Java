/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textpassbyvalue;

/**
 *
 * @author AI小政
 */
public class TextPassByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 1;
        int num2 =2;
        System.out.println("Before invoking the swap method, numl is" +
                num1 + "and num2 is " + num2);
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is " +
                num1 + "and num2 is " + num2);
    }
    public static void swap(int n1, int n2){
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swaping, n1 is " + n1
        + "and n2 is " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tAfter swaping, n1 is " + n1
        + "and n2 is " + n2);
    }
    
}
