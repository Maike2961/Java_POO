
package aula06exercicio3;
import java.util.Scanner;

/**
 *
 * @author Mayki
 */
public class Aula06exercicio3 {

    public static void main(String[] args) {
        Torneio t1 = new Torneio("maike",22);
        Scanner sc = new Scanner(System.in);
        System.out.println(t1.getNome());
        //setNome esta mudando o nome ja colocado em torneio t1// 
        
        //t1.setNome = "maiky"; esse é o jeito antigo 
        //String nome = sc.next();
       // t1.setNome("maiky");
       // System.out.println(t1.getNome());
        
        //int idade = sc.nextInt(t1.getIdade());
        System.out.println(t1.getIdade());
        System.out.println(t1.verificaCategoria());
    }
    
}
