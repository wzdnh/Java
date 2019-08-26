/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlist2.pkg5;

/**
 *
 * @author 帅帅的阿政
 */
public class ProgramList25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int x = 500;
        int minut = x / 60;
        int seconds = x % minut;
        System.out.print(" The time is " + minut + " minut " + " and " + 
                seconds + " seconds ");
    }
    
}
