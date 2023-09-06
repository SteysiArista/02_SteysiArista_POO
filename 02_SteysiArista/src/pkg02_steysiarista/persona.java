/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_steysiarista;

import java.util.Scanner;

public class persona {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        nombre = scanner.next();
        System.out.print("Ingrese una edad: ");
        edad = scanner.nextInt();
        scanner.close();
    }
}
