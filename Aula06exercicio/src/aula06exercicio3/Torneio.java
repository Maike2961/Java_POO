/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06exercicio3;

/**
 *
 * @authormayki
 */
public class Torneio {
  private String nome;
  private int idade;

public Torneio(String n, int i){
   idade = i;
   nome = n;
}
// metodos de acesso //
public String getNome(){
 return nome;
} 
//String para conseguir o nome e retornar o atributo nome// 

public int getIdade(){
return idade;
}

public void setIdade(int i){
 idade = i;
} // metodo set coloque Void//

public void setNome(String n){
nome = n;
}

public String verificaCategoria(){
   if (idade >= 5 && idade <=7) {
     return "infantil";
   }else if(idade >= 8 && idade <=10){
     return "juvenil";
   }else if(idade >=11 && idade<=15){
     return "adolescente"; 
   }else if(idade >= 16 && idade<=30){
     return "Adulto";
   } else if(idade >= 30){
     return "senior";
   }
   return "Error na categoria ";
}

void imprimeDados(){

System.out.println(verificaCategoria());


}





    
}
