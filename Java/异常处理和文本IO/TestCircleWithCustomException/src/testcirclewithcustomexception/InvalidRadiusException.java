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
public class InvalidRadiusException extends Exception {
    private double radius;
    
    public InvalidRadiusException (double radius) {
        //调用父类的方法和构造方法
        super("Invalid radius" + radius);
        this.radius = radius;
    
    }
    
    public double getRadius(){
        return radius;
    }
    
}
