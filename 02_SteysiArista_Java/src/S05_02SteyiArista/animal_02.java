
package S05_02SteyiArista;

import javax.swing.JOptionPane;

public class animal_02 {
        String nombre;
    int años;
    int numpatas;
    public void vida () {
         System.out.println("ese animal tiene "+años+" años");
    }
    public void patas () {
         System.out.println("ese animal tiene "+numpatas+" patas");
    }
    public void tipo () {
         System.out.println("ese animal es un "+nombre);
    }
    public void preguntar(){
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        años = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la edad"));
        numpatas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de patas"));
}
        public void responder(){
        JOptionPane.showMessageDialog(null, "Hola mi nombre es " + nombre + ", tengo " + años + "y tengo patas" + numpatas);
    }
}
