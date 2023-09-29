
package S05_02SteyiArista;

import javax.swing.JOptionPane;

public class persona_02 {
//atributos
    String nombre;
    int edad ;
//metodos
    public void hablar () {
        System.out.println(nombre + " dice hola");
    }
    public void edad () {
        System.out.println(nombre + " tiene "+edad);
    }
    public void preguntar() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la edad"));
    }
        public void responder(){
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", tengo " + edad);
    }
    }
