package com.campusdual.ejerciciospoo_campusdual.ejerciciodieta;

import java.util.ArrayList;
import java.util.List;
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
public class DietProgram {
    private Diet diet;
    private List<Food> foodList;
    private Scanner keyBoard;

    public DietProgram() {
        this.foodList = new ArrayList<>();
        this.keyBoard = new Scanner(System.in);
    }

    public void showMenu() {
        Integer option = null;
        do {

            System.out.println("1. Crear/Reiniciar dieta");
            System.out.println("2.Mostrar informacion de la dieta");
            System.out.println("3.Agregar alimentos");
            System.out.println("4.Finalizar");
            option = keyBoard.nextInt();
            switch (option) {
                case 1:
                    startDiet();
                    System.out.println("Inicie una nueva dieta");

                    break;
                case 2:
                    showDietInfo();
                    System.out.println("Detalles de su dieta: ");
                    break;
                case 3:
                    addFood();
                    System.out.println("Añada el alimento que desee para su dieta");
                    break;
                case 4:
                    endProgram();
                    System.out.println("Gracias por utilizar el programa de gestión de dietas");
                    break;
                default:
                    getOption();
                    System.out.println("Por favor escriba una opción disponible entre 1 y 4");
                    break;
            }


        } while (option != 4);

    }

    public void startDiet() {

        Integer option = null;
        do {

            System.out.println("1.Crear dieta sin límites");
            System.out.println("2.Crear dieta con límite de calorías");
            System.out.println("3.Crear dieta con límite de macronutrientes");
            System.out.println("4.Crear dieta a partir de datos personales");
            option = keyBoard.nextInt();

            switch (option) {
                case 1:
                    this.diet = new Diet();
                    System.out.println("se ha creado una dieta sin límites");

                    break;
                case 2:
                    this.diet.getMaxCalories();
                    System.out.println("Detalles de su dieta: ");
                    break;
                case 3:
                    this.diet.getMacroNutrients();
                    System.out.println("Se ha creado una Dieta con x límite de macronutrientes");
                    break;
                case 4:
                    this.diet.getPersonalData();
                    System.out.println("Se ha creado una dieta a partir de sus datos personales");
                    break;
                default:
                    getOption();//HACER METODO
                    System.out.println("Por favor escriba una opción disponible entre 1 y 4");
                    break;
            }


        } while (option != 4);

    }

    private void showDietInfo() {
        System.out.println("Información de la Dieta");
        System.out.println("El número máximo de calorías es  " + this.diet.getMaxCalories());
        System.out.println("Los alimentos de la dieta son los siguientes: " + this.diet.getAllIntakes());
    }

    private void addFood() {
        System.out.println("Escoja un alimento de la lista" + this.diet.getAvaliableFoods());
        System.out.println("Añada un alimento: " + this.diet.getNewFoods());
    }

    private void endProgram() {

        System.out.println("Finalice esta dieta y salga del programa");
    }


    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean isValidOption = false;

        do {
            System.out.println("Por favor escriba una opción disponible entre 1 y 4");
            String input = scanner.nextLine();

            try {
                option = Integer.parseInt(input);
                if (option >= 1 && option <= 4) {
                    isValidOption = true;
                } else {
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        } while (!isValidOption);

        return option;
    }
}
