/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livro;

/**
 *
 * @author logon
 */
public class Livro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        livro2 t1 = new livro2();
        t1.autor="maike";
        t1.titulo="canção dos passaros e serpentes";
        t1.edicao=2021;
        
        System.out.println("o autor é: "+t1.autor);
        System.out.println("o livro é: "+t1.titulo);
        System.out.println("a edição é: "+t1.edicao);
    }
    
}
