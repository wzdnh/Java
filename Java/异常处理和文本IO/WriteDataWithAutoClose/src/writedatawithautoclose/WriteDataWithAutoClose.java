/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writedatawithautoclose;

/**
 *
 * @author AI小政
 */
public class WriteDataWithAutoClose {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        
        try (
            java.io.PrintWriter output = new java.io.PrintWriter(file); 
        )   {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric k Jones ");
            output.print(85);            
        }
    }
    
}
