/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap1p2_jorgeramirez;

import java.util.Scanner;

/**
 *
 * @author Jorge Ramirez
 */
public class LAP1P2_JorgeRamirez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido a mi laboratorio #1");
        System.out.println("Ingrese un numero del 1 al 3 para entrar a un programa o salir del todo.");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Salir ");
        System.out.println("Seleccione una opcion");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ejercicio 1");
                System.out.print("Ingrese el coefeciente de a: ");
                double a = sc.nextDouble();
                System.out.print("Ingrese el coefeciente de b: ");
                double b = sc.nextDouble();
                System.out.print("Ingrese el coefeciente de c: ");
                double c = sc.nextDouble();
                double vertice= (-b)/(2*a);
                double suma= vertice+200;
                double resta= vertice-200;
                int desplazamiento= 100;
                System.out.println();
                break;
            case 2:
                System.out.println("Ejercicio 2");
                System.out.print("Ingrese el valor de x: ");
                double x = sc.nextDouble();

                System.out.print("Ingrese el limite de la sumatoria (n): ");
                int n = sc.nextInt();

                System.out.println("Aproximacion del seno: " + seno(x, n));
                System.out.println("Aproximacion del coseno: " + coseno(x, n));
                System.out.println("Aproximacion de la tangente: " + tangente(x, n));

                sc.close();
                break;
            case 3:
                System.out.println("Salir");
                System.out.println("Gracias por haber usado el programa, que tengas un lindo dia/noche.");
                break;
            default:
                System.out.println("Opcion invalida, ingrese un numero entre el 1 al 3");
                
        }
    }
    public static double seno(double x, int n) {
        if (n == 0) {
            return x;
        } else {
            return ((Math.pow(-1, n) * Math.pow(x, 2 * n + 1)) / factorial(2 * n + 1)) + seno(x, n - 1);
        }
    }

    public static double coseno(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return ((Math.pow(-1, n) * Math.pow(x, 2 * n)) / factorial(2 * n)) + coseno(x, n - 1);
        }
    }

    public static double tangente(double x, int n) {
        return seno(x, n) / coseno(x, n);
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    
    public static int Result1(int a, int b , int c, int desplazamiento){
        int cont=0;
        int resultado = 0;
        if (cont>100) {
            return desplazamiento;
        } else {
            return resultado;
        }
    }
}
