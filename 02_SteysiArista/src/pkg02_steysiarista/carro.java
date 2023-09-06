/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_steysiarista;

import javax.swing.JOptionPane;

public class carro {
    String  marca;
    String color;
    String kilometraje;
    public void acelerar () {
        System.out.println(" mi carro acelera " + kilometraje );
    }
    public void frenar () {
        System.out.println(" mi carro de color " + color + " a frenado");
    }
    public void sonido () {
        System.out.println(" mi carro " + marca + " tiene buen sonido" );
    }
    public void preguntar(){
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca");
        color  = JOptionPane.showInputDialog(null, "Ingrese el color");
       kilometraje = JOptionPane.showInputDialog(null, "ingrese el km");
    }
}
