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
public class testOverridding {
     public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Tahmid Hasan Talukdar";
        t1.age = 27;
        t1.qualification = "BSc in EEE";
        t1.display();
        
        Person p1 = new Person();
        p1.name = "Tareq Hossain";
        p1.age = 30;
        p1.display();
    }
}
