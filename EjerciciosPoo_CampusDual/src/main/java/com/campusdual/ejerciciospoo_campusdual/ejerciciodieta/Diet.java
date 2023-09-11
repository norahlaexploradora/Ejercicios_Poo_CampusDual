package com.campusdual.ejerciciospoo_campusdual.ejerciciodieta;

import com.campusdual.ejerciciospoo_campusdual.ejemplos.alimentos.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
* Escribe una clase dieta, que teniendo en cuenta una serie de alimentos, vaya sumando cantidades en gramos y calcule cuentas calorías, carbohidratos, proteinas y grasas genera la ingesta
La clase dieta tiene que tener las siguientes funcionalidades:
	-Diet(): crea una dieta sin límite de calorías
	-Diet(Integer maxCalories): crea una dieta con un máximo de calorías, en cuanto se supera ese máximo cuando se adjunta un alimento se despliega un error
	-Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein): crea una dieta con un máximo de estos tres valores, si se supera alguno de ellos cuando se adjunta un alimento se indicara cual y desplegará un error
	-Diet(Boolean women, Integer age, Integer height, Integer weight): Calcula el metabolismo basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
			E = edad
			A = altura en centímetros
			P = peso en kilos

			Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
			Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
	-addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProtein(): devuelve el total de proteinas
*
* */


public class Diet extends Food {

    protected Integer maxCalories;
    protected List<Intake> intakes;
    protected Integer maxFats;
    protected Integer maxProtein;
    protected Boolean women;
    protected Integer age;
    protected Integer height;
    protected Integer weight;
    protected Boolean isLimited;
    protected Integer metabolism;
    ////////
    protected List<Food> newFoods;

    protected String food;
    protected ArrayList<Food> avaliableFoods;

    protected Integer calories;

    protected Integer macroNutrients;

    protected String personalData;


    protected String option;

    public Diet() {
    }

    public Diet(Integer calories) {
    }

    public Diet(String personalData) {
        this.personalData = personalData;
    }


    public void Diet() {
        this.isLimited = false;
    }

    public void Diet(Integer maxCalories) {
        this.maxCalories = maxCalories;
        this.isLimited = true;
    }


    public void Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein) {
        this.maxFats = maxFats;
        this.maxCarbs = maxCarbs;
        this.maxProtein = maxProtein;
        this.isLimited = true;
    }

    public void Diet(Boolean women, Integer age, Integer height, Integer weight) {
        this.metabolism = calculateMetabolism(women, age, height, weight);
        this.isLimited = true;
    }


    public void addFood(Food food) {
        newFoods.add(food);
    }


    public ArrayList avaliableFoods() {
        this.avaliableFoods = new ArrayList<>(Arrays.asList());
        return avaliableFoods;
    }

    public List newFoods() {
        String newElement = "";
        this.newFoods = new ArrayList<>();
        return newFoods();
    }


    public String getAllIntakes() {
        String result = "";
        for (Intake element : this.intakes) {
            result = result + element.getName() + ":" + element.getGrams() + ",";
        }
        return result;
    }

    public Integer calculateMetabolism(Boolean women, Integer age, Integer height, Integer weight) {
        return ((weight = 10) + (height = (int) 6.25) - (age = 5)) - 161;
    }

    public String addPersonalData(String name, Integer age, String birthplace) {

        return personalData;
    }

    //Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
    //Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
    public Integer getCalories(Integer weight) {

        return ((carbos * 4) + (fats * 9) + (proteins * 4)); //método
    }

    public Integer selectDiet(Integer calories, Integer macroNutrients) {

        Integer selectDiet = null;
        return selectDiet;//método
    }

    public Integer showInfo() {
        return showInfo();
    }

    public Integer getTotalCalories() {
        return getTotalCalories();
    }

    public Integer getTotalCarbs() {
        return getTotalCarbs();
    }

    public Integer getTotalFats() {
        return getTotalFats();
    }

    public Integer getTotalProtein() {
        return getTotalProtein();
    }


    public Integer getMaxCalories() {
        return maxCalories;
    }

    public void setMaxCalories(Integer maxCalories) {
        maxCalories = maxCalories;
    }


    public Integer getMaxFats() {
        return maxFats;
    }

    public void setMaxFats(Integer maxFats) {
        this.maxFats = maxFats;
    }

    public Integer getMaxProtein() {
        return maxProtein;
    }

    public void setMaxProtein(Integer maxProtein) {
        this.maxProtein = maxProtein;
    }

    public Boolean getWomen() {
        return women;
    }

    public void setWomen(Boolean women) {
        this.women = women;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getLimited() {
        return isLimited;
    }

    public void setLimited(Boolean limited) {
        isLimited = limited;
    }

    public Integer getMetabolism() {
        return metabolism;
    }

    public void setMetabolism(Integer metabolism) {
        this.metabolism = metabolism;
    }

    public Integer getMacroNutrients() {
        return macroNutrients;
    }

    public void setMacroNutrients(Integer macroNutrients) {
        this.macroNutrients = macroNutrients;
    }

    public List<Food> getNewFoods() {
        return newFoods;
    }

    public void setNewFoods(List<Food> newFoods) {
        this.newFoods = newFoods;
    }

    public ArrayList<Food> getAvaliableFoods() {
        return avaliableFoods;
    }

    public void setAvaliableFoods(ArrayList<Food> avaliableFoods) {
        this.avaliableFoods = avaliableFoods;
    }


    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }





}
