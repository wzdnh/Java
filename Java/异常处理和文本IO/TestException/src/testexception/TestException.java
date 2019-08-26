/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;

/**
 *
 * @author AI小政
 */
public class TestException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("AAAA" +sum(new int[] {1, 2, 3, 4,5}));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage() + "BBBB");
            System.out.println("\n" + ex.toString()+ "CCCC");
            System.out.println("\nTrace Info Obtained from getStackTrace" + 
                    "DDDD");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method" + traceElements[i].getMethodName() + "EEEE");
                System.out.print("(" + traceElements[i].getClassName() + ":" + "FFFF");
                System.out.println(traceElements[i].getLineNumber() + ")" + "GGGG");
            }
        }
    }
    
    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++)
            result += list[i];
        return result;
    }
    
}
