/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author tuhin
 */
public class circle extends shape {
        circle (double r)
    {
        super(r, r);
              
    }
        @Override
void area()
{
    double result = Math.PI *dim1*dim2;
    System.out.println("The area of circle:  "+result);
}
}
