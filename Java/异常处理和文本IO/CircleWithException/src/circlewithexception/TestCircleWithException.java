/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithexception;
import java.lang.ArithmeticException;

/**
 *
 * @author AI小政
 */
public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException C1 = new CircleWithException(5);
            CircleWithException C2 = new CircleWithException(15);
            CircleWithException C3 = new CircleWithException(0);
            System.out.println("AAAAAAAAAAAAAAAAAAA");
        }
        catch (IllegalArgumentException ex) {
            //throw ArithmeticException;
            System.out.println(ex);
        }
        
        finally {
            System.out.println("BBBBBBBBBBBBBBBBB");
        }
    
        System.out.println("Number of objects created: " + 
            CircleWithException.getNumberOfObject());
        
    }
    
}
