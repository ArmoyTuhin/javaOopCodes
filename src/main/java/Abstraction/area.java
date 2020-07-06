package Abstraction;


/**
 *
 * @author tuhin
 */
public class area {
    public static void main(String[] args) {
         shape shape;
    
    shape = new triangle(4.5,6.5);
    shape.area();
    
     shape = new rectangle(2.5,3.5);
    shape.area();
    
     shape = new circle(4.0);
    shape.area();
    
    }
   
    
}
