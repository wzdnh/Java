/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacetext;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class ReplaceText {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        if (args.length != 4) {
            System.out.println(
                "Usafe: java ReaplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }
        
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + "does not exists");
            System.exit(2);
        }
        
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("TargetFile " + "args[1]" + "alreaday exists");
            System.exit(3);
        }
        
        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);                
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
      
        }
   
    }
    
}
