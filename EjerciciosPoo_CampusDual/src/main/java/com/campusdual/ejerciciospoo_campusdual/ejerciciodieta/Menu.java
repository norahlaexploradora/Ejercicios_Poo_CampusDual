package com.campusdual.ejerciciospoo_campusdual.ejerciciodieta;

import java.util.Scanner;

/*
* --Escribe un programa que utilice la clase Dieta y despliegue un menú donde puedas añadir alimentos. El menú tendrá las siguientes opciones.
	-1. Crear/reiniciar dieta: crea o remplaza la dieta inicial
		-a. Sin limite
		-b. Por calorías
		-c. Por macronutrientes
		-d. Por datos personales
	-2. Mostrar información: muestra calorías y macronutrientes de la dieta
	-3. Agregar alimento: agrega un alimento a la dieta actual y añade ese alimento a la lista de alimentos disponible
		-a. Nuevo alimento
		-b. Alimento existente
	-4. Salir
* */
public class Menu {

    public static void main2(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Crear/Iniciar una dieta");

        System.out.println("Agregar alimento");
        System.out.println("Agregar alimento");
        System.out.println("Salir de la Dieta");
        int select = teclado.nextInt();
        Diet selectDiet = new Diet();


        switch (select) {

            case 1:
                System.out.println("Elección:Dieta sin límite");

                break;
            case 2:
                System.out.println("Elección:Dieta por calorías" + "Ingrese el número de calorías");

                break;

            case 3:
                System.out.println("Elección:Dieta por macronutrientes");
                break;
            case 5:
                System.out.println("Elección:Dieta por datos personales");
                break;

            default:
                System.out.println("la elección no es válida");
                break;
        }


    }

    public static void main(String[] args) {
        DietProgram dietProgram = new DietProgram();
        dietProgram.showMenu();


    }

}

