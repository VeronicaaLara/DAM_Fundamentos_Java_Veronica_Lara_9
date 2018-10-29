package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // pedir tres numeros y mostrarlos de mayor a menor.

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero2 >= numero3) {
            System.out.println("El orden es:" + numero1 + "," + numero2 + "," + numero3);
        } else {
            if (numero1 >= numero3 && numero3 >= numero2) {
                System.out.println("El orden es:" + numero1 + "," + numero3 + "," + numero2);
            } else {
                if (numero2 >= numero1 && numero1 >= numero3) {
                    System.out.println("El orden es;" + numero2 + "," + numero1 + "," + numero3);
                } else {
                    if (numero2 >= numero3 && numero3 >= numero1) {
                        System.out.println("El orden es;" + numero2 + "," + numero3 + "," + numero1);
                    } else {
                        if (numero3 >= numero1 && numero1 >= numero2) {
                            System.out.println("El orden es;" + numero3 + "," + numero1 + "," + numero2);
                        } else {
                            System.out.println("El orden es;" + numero3 + "," + numero2 + "," + numero1);
                        }
                    }
                }
            }
        }
        sc.close();
    }

}
