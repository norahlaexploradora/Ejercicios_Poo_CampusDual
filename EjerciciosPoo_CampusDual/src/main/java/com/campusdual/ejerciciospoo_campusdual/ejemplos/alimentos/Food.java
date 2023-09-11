package com.campusdual.ejerciciospoo_campusdual.ejemplos.alimentos;

import java.util.ArrayList;

public class Food {



    public Integer carbos;
    public Integer fats;
   public Integer proteins;
    public Integer calories;
    public
    Integer maxCalories;
    public Integer maxCarbs;
    protected Integer ingredientsList;
    ArrayList intakes;



    public Food(Integer maxCalories) {
        this.maxCalories = maxCalories;
    }

    public Food(ArrayList intakes) {
        this.intakes = intakes;
    }

    public Food(){
        this.carbos=0;
        this.fats=0;
        this.proteins=0;
        this.calories=0;
    }

    public Food(Integer carbos, Integer fats, Integer proteins, int proteins1, int calories) {
        this.proteins = proteins;
        this.calories = calories;
    }

    public Food(int carbos, int fats, int proteins) {
        this.carbos= carbos;
        this.fats=fats;
        this.proteins=proteins;
    }



public static Integer getcalories(Integer weight, Integer carbos, Integer fats, Integer proteins){
        return((carbos*4)+(fats*9)+(proteins*4)); // metodo estático
}



public Food(Integer carbos, Integer fats, Integer proteins, Integer calories){
    this.carbos=carbos;
    this.fats=fats;
    this.proteins=proteins;
    this.calories=calories; //constructor

}

    public Integer getCalories(int i) {
        return calories;
    }

    public void setCalories(Integer calories) {
        calories = calories;
    }

    public Integer getCarbos() {
        return carbos;
    }
    public void setCarbos(Integer carbos) {
        this.carbos = carbos;
    }

    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        proteins = proteins;
    }

    public ArrayList getIntakes() {
        return intakes;
    }

    public void setIntakes(ArrayList intakes) {
        this.intakes = intakes;
    }


}
