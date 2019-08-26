/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulatorwithexception;

/**
 *
 * @author AI小政
 */
public class CalculatorWithException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 3) {
            System.out.println(
                    "Usage: java calulator operand1 operator operand2");
        }
        int result = 0;
        switch (args[1].charAt(0)) {
            case + "：" result = Integer.parseInt(args[0]) +
                                Integer.parseInt(args[0]);
        }
    }
    
}
