/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithexception;

/**
 *
 * @author AI小政
 */
public class CircleWithException {

    /**
     * @param args the command line arguments
     */
    private double radius;
    private static int numberOfObjects = 0;
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double newRadius)
            throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException(
                "Radius cannot be negative");
    }
    public static int getNumberOfObject(){
        return numberOfObjects;
    }
    
    public double findArea(){
        return radius * radius * 3.14159;
    }
       
}
