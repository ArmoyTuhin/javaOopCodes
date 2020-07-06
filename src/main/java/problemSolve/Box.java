/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemSolve;

/**
 *
 * @author tuhin
 */
public class Box {
    
    double height ;
    double width;
    double depth ;
    
    Box(double h , double w , double d)
    {
        height= h;
        width=  w;
        depth=  d;
    }
    
    void displayvol()
    {
        double result = height *width* depth;
        System.out.println("Volume is"+result);
    }
    
    }

