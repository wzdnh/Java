/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcirclewithcustomexception;

/**
 *
 * @author AI小政
 */
public class TestCircleWithCustomException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            new CircleWithCustomException(5);
            
            new CircleWithCustomException(0);
            new CircleWithCustomException(-5);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " +
                CircleWithCustomException.getNumberOfObjects());
    }    
}

class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }
    
    public CircleWithCustomException(double newRadius)
            throws InvalidRadiusException {
        setRadius(newRadius);   //判断半径是否为负，如果为负则抛出异常
        numberOfObjects++;  //计算错误之前有几个正确的对象
        
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double newRadius)
            throws InvalidRadiusException {
        if (newRadius >=0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
        
    }
    
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    public double findArea() {
        return radius * radius * 3.14159;
    }
    
}

