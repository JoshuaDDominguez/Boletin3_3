/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir1 = new Circulo();
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        System.out.println(cir1.calcularArea());
        System.out.println(cir1.calcularLonxitude());
    }
    
}
