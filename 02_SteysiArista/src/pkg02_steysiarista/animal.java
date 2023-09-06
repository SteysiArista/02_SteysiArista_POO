/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_steysiarista;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class animal {
    String nombre;
    int años;
    int numpatas;
    public void vida () {
         System.out.println("ese animal tiene "+años+"años");
    }
    public void patas () {
         System.out.println("ese animal tiene "+numpatas+"patas");
    }
    public void tipo () {
         System.out.println("ese animal es un"+nombre);
    }
    public void preguntar(){
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        años = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la edad"));
        numpatas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de patas"));
}
}
