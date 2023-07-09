/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paciente;

/**
 *
 * @author logon
 */
public class Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dados d = new dados();
        d.nome= "Mayki";
        d.rg = "50350628-4";
        d.telefone = "568911325";
        d.endereco = "Rua Geraldo baldes leitão";
        
        System.out.println("Nome: "+d.nome);
        System.out.println("RG: "+d.rg);
        System.out.println("Telefone: "+d.telefone);
        System.out.println("Endereco: "+d.endereco);
        // TODO code application logic here
    }
    
}
