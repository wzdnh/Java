/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcirclerectangle;

/**
 *
 * @author 帅帅的阿政
 */
public class TestCircleRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         CircleFromSimpleGeometricObject circle =
          new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diamester is " + circle.getDiamester());
        RectangleFromSimpleGeometricObject rectangle =
          new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimester is " +
          rectangle.getPerimeter());
    }
    
}
