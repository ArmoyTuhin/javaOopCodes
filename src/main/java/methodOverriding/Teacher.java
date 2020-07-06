/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodOverriding;

/**
 *
 * @author tuhin
 */
public class Teacher extends Person {
     String qualification;
    
     @Override
    void display(){
        
         
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification); 
    }
    
}
