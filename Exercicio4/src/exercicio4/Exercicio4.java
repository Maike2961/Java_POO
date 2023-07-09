package exercicio4;
import javax.swing.JOptionPane;

/**
 *
 * @author mayki pereira da silva rgm 29401305
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float raio = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a circunferencia"));
       Circunferencia c = new Circunferencia(raio);
       c.area();
       c.perimetro();
       c.mostra();
       
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retângulo em cm"));
        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retângulo em cm "));

        Retangulo r = new Retangulo(altura, base);

        r.area();
        r.perimetro();
        r.mostra();
       
        float a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retângulo em cm"));
        float b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retângulo em cm "));
        
        Triangulo t = new Triangulo(altura , base);
        
        t.area();
        t.mostra();
        
    
       
       
       
    }
    
}
