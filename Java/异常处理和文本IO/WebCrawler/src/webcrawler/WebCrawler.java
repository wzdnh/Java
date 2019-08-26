/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AI小政
 */
public class WebCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter a URL: ");
        String url = input.nextLine();  //读取的内容赋给url
        crawler(url);
    }
    
    public static void crawler(String startingURL){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && 
                listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl: " + urlString);
                
                for (String s : getSubURLs(urlString)){
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }       
        }
    }
    
    public static  ArrayList<String> getSubURLs(String urlString)   //返回附属的URL 
            {
         ArrayList<String> list = new ArrayList<>();
         
        try {
            java.net.URL url = new java.net.URL(urlString); 
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            //读取一个URL
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current); //URL一般以“结束 
                    if (endIndex > 0 ) {   //确保找到当前URL
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }
                    else
                        current = -1;                   
                }
            }    
        }
        catch (Exception ex) {
            System.out.println("Erros: " + ex.getMessage());
        }
        
        return list;
    }
}
