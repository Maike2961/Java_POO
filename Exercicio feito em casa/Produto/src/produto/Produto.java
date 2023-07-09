/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;
import java.util.Scanner;

/**
 *
 * @author MAYKI PEREIRA DA SILVA RGM 29401305
 */
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Produt t1 = new Produt("adidas","Mike","BXR",6590);
     Scanner sc = new Scanner(System.in);
     System.out.println("A marca do produto é: "+t1.marca);
     String marca = sc.nextLine();
     System.out.println("O fabricante da marca é: "+t1.fabricante);
     String fabricante = sc.nextLine();
     System.out.println("O codigo de barras é: "+t1.cod_barras);
     String cod_barras = sc.nextLine();
     System.out.println("o preço está por: "+t1.preco);
     float preco = sc.nextFloat();
    }
    
}
