/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdata;

import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class ReadData {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        java.io.File file = new java.io.File("scores.txt");
        try (Scanner input = new Scanner(file)) {            
            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(
                        firstName + " " + mi + " " + lastName + " " + score );
            }
        }
    }
    
}
