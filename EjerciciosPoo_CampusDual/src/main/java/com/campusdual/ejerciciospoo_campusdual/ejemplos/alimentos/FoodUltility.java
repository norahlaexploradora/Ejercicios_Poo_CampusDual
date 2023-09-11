package com.campusdual.ejerciciospoo_campusdual.ejemplos.alimentos;

public class FoodUltility {
    public static void main(String[] args) {
        Food zanahoria = new Food(12, 0, 1);
        System.out.println(zanahoria.getCalories(100));
        Food bistec = new Food(0,15,27);
        System.out.println("100 g Bistec:" + bistec.getCalories(100));

    Food lechuga = new Food();
    lechuga.setCarbos(1);
    lechuga.setProteins(0);
    lechuga.setFats(0);
        System.out.println("100g lechuga" + lechuga.getCalories(100));


    }
}
