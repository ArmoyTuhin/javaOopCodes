/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorOverloading;

/**
 *
 * @author tuhin
 */
public class Teacher {
    int age;
String name, address ;
  float salary; 
     Teacher()
    {
        System.out.println("No Argumentws");
    }
     Teacher(String s , String ad ) 
    {
        name=s;
        address=ad;
    }
 Teacher(String s , String ad , float sal) 
    {
           name=s;
        address=ad;
        salary = sal;
    }
 Teacher(String s , String ad , int ag, float sal) 
    {
        name=s;
        address=ad;
        salary = sal;
        age =ag;
    }
    void display()
    {
       System.out.println("Name "+name);
         System.out.println("Address "+address); 
            System.out.println("Age "+age);
              System.out.println("salary "+salary); 
              System.out.println("\n");
    }
}
