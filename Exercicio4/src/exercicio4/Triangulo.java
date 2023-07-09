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
public class Triangulo extends Forma {
    protected float base;
    protected float altura;
    
    
    public Triangulo( float b, float h){
    base = b;
    altura = h;
    
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }
    
    @Override
    public float area(){
    return (base*altura)/2;
    }
    
  public void mostra(){
            System.out.println("\nBase: " + base + "\nAltura: " + altura + "\nArea: " + area());
  }
}