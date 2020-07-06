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
public class school {
        public static void main(String[] args) {
        
     Teacher teacher1 = new Teacher("Tuhin","Laldighi");
     teacher1.display();
     
     Teacher teacher2 = new Teacher("Karim","Kotwali",60000);
     teacher2.display();
     
     Teacher teacher3 = new Teacher("Rahim","Askardighi",45000,50);
     teacher3.display();
     
      
    }
}
