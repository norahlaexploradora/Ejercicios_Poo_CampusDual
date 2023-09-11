package com.campusdual.ejerciciospoo_campusdual.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer bisiesto;
        System.out.println("escriba un año");
        Scanner teclado = new Scanner(System.in);
        bisiesto = teclado.nextInt();
        if (bisiesto %4 == 0){

            if(bisiesto %100 == 0 && bisiesto %400 != 0){
                System.out.println(" no es bisiesto");
            }else{
                System.out.println("es bisiesto");
            }
        }else{
            System.out.println("no es bisiesto");
        }

    }
}
