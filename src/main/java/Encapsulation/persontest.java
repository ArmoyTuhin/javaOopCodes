/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author tuhin
 */
public class persontest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Aditi");
        p1.setAge(5);
        p1.setHeight(4.8);
        System.out.println("Name : "+p1.getName());
        System.out.println("Age : "+p1.getAge());
        System.out.println("Height : "+p1.getHeight());
    }
}
