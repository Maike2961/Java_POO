/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.util.Scanner;

/**
 *
 * @author mayki
 */
public class angulo {
    float base;
    float altura;
    
public angulo(){}

public angulo(float b, float a, float calculaArea){
base = b;
altura = a;
}

float calculaArea(){
 
    return base*altura/2;
}

void imprimeDados(){
    
        System.out.println("a area do triangulo é: "+altura);
        System.out.println("a base do triangulo é: "+base);
        System.out.println(" a area é: "+calculaArea());


}

    
}
