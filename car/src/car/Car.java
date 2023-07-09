/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author logon
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro t1 = new Carro();
        
        t1.ano= 2021;
        t1.marca="hyuudai";
        t1.modelo="i30";
        
        
        System.out.println("o modelo é: "+t1.modelo);
        System.out.println("o ano é: "+t1.ano);
        System.out.println("a marca é: "+t1.marca);
        
       
    }
    
}
