/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat;
import javax.swing.JOptionPane;


/**
 *
 * @author mayki
 */
public class data {
    int data;
    int mes;
    int ano;
    
public data(){}

public data(int d, int m, int a){
data = d;
mes = m;
ano = a;

}

public void cadastraDados(){
    
   data = Integer.parseInt("Digite a data");
   mes = Integer.parseInt("Digite o mes");
   ano = Integer.parseInt("digite o ano");
    
   
}

public void imprimeData(){
    JOptionpane.showMessageDialog("o mes é de: "+mes);
    JOptionpane.showMessageDialog("o ano é: "+ano);
    JOptionpane.showMessageDialog("a data é de");


}
}
