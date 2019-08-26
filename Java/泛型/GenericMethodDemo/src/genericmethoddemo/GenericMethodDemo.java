/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethoddemo;

/**
 *
 * @author AI小政
 */
public class GenericMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Anstin"};
        Double[] doubles = {1.1, 2.1, 3.1, 4.1};
        
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
        
        //.GenericMethodDemo.<Doulbe>print(doubles);
    }
        
        public static <E> void print(E[] list) {
            for (int i = 0; i < list.length; i ++) {
                System.out.print(list[i] + " ");
            System.out.println();
            }
        }
        
    }
    
