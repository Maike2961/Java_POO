/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author mayki
 */
public class Retangulo extends Triangulo {
    
    
    public Retangulo(float base, float altura){
       super(base,altura);
 
    }
    
    public float area(){
    return (base*altura);
    }
    
    public float perimetro(){
    return (base +altura)*2;
    }
     
    public void mostra(){
    System.out.println("\nBase: "+base
                        +"\nAltura: "+altura
                         +"\nArea: "+area()
                          +"\nPerimetro: "+perimetro());
    }
    
}
