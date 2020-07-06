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
public class triangle extends shape{
    
    triangle(double dim1,double dim2)
    {
        super(dim1, dim2);
              
    }
    @Override
void area()
{
    double result = 0.5*dim1*dim2;
    System.out.println("The area of tringle "+result);
}
}
