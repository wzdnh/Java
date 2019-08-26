/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfilefromurl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class ReadFileFromURL {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, 
            IOException {
        // TODO code application logic here
        System.out.println("Please enter a URL: ");
        String URLString = new Scanner(System.in).next();
        
        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();          
            }
            System.out.println("The File size is " + count + " characters");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) {
            System.out.println("I/O errors: no such file");
        }
    }    
}
