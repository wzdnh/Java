/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writedata;

import java.io.IOException;

/**
 *
 * @author AI小政
 */
public class WriteData {

    /**
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("John T Smith ");
        output.println("90");   //让下一行换行
        output.print("Eric k Jones ");
        output.println("85");
        output.close();
        
    }
    
}
