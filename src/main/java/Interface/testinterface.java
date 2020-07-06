/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.waterBottleInterface.color;

/**
 *
 * @author tuhin
 */
public class testinterface {
    public static void main(String[] args) {
        interfaceExample obj = new interfaceExample() ;
        System.out.println("Color : "+color);
        obj.fillup();
    }
}
