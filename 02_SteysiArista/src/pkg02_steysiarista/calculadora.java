/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_steysiarista;

import java.util.Scanner;

public class calculadora {
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
    
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        a = scanner.nextInt();
        System.out.print("Digite el segundo número: ");
        b = scanner.nextInt();
        scanner.close();
}
public void responder(){
    System.out.println("La suma es: " + totalsuma);
        System.out.println("La resta es: " + totalresta);
        System.out.println("La multiplicación es: " + totalmultiplicar);
        System.out.println("La división es: " + totaldividir);
}
}
