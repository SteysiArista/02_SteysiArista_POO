
package S05_02SteyiArista;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class calculadora_02 {
    //atributos
    int a;
    int b;
    int totalsuma;
    int totalresta;
    int totaldividir;
    int totalmultiplicar;
public void multiplicar () {
    totalmultiplicar = a* b;
    System.out.println("la multiplicacion es "+totalmultiplicar);
}
public void sumar () {
    totalsuma = a + b;
    System.out.println("la suma es "+totalsuma);
}
public void resta () {
    totalresta = a - b;
    System.out.println("la resta es "+totalresta);
}
public void dividir () {
    totaldividir = a / b;
    System.out.println("la resta es "+totaldividir);
}
public void preguntar (){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nombre"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la edad"));
}
public void responder(){
    JOptionPane.showMessageDialog(null,"La suma es: " + totalsuma);
        JOptionPane.showMessageDialog(null,"La resta es: " + totalresta);
        JOptionPane.showMessageDialog(null,"La multiplicación es: " + totalmultiplicar);
        JOptionPane.showMessageDialog(null,"La división es: " + totaldividir);
}
}
