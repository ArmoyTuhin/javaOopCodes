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
public abstract class shape {
      
    double  dim1,dim2 ;
    shape(double dim1, double dim2 )
    {
     this.dim1 = dim1 ;
     this.dim2 = dim2 ;
    }
    
 abstract void area();

}
