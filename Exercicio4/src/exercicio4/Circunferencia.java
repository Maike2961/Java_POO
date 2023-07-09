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
public class Circunferencia extends Forma{
    
    private float raio;
    
    public Circunferencia(float r){
        raio = r;
    }
    
    public void setCircunferencia(float r){
    raio = r;
    }

    public float getRaio() {
        return raio;
    }
    @Override
    public float area(){
    return(float)(Math.PI*raio*raio);
    
    }
    
    @Override
    public float perimetro(){
    return 2*raio*3.14f;
    
    }
    @Override
   public void mostra(){
            System.out.println("\nRaio: " + raio 
                                +"\nArea: "+ area()
                                +"\nPerimetro: "+perimetro());
   }
}