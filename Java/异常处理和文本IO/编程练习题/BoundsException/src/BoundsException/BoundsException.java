/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoundsException;

import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class BoundsException {

    /**
     * @param args the command line arguments
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        // TODO code application logic here
        int [] list = new int [100];
        int counter = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the corresponding subscript :");
  
        while (counter < 99){
            int m = (int) (Math.random() + 99);
            list[i] = m;
            counter ++;     
        }
        try {
            int m;
            m = input.nextInt();
            System.out.println(list[m]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        
    }
    
}
