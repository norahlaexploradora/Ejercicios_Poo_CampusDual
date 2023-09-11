package com.campusdual.ejerciciospoo_campusdual.ejerciciodieta;

public class Intake extends Food {

    private Integer grams;

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public static final Integer GRAMS_PER_PORTION = 100;

    public Intake(String name) {
        super(name);
        this.grams = 0;
    }

    public Intake(String name, Integer carbos, Integer fats, Integer proteins, Integer grams) {
        super(name, carbos, fats, proteins);
        this.grams = grams;
    }

    public Integer calculatedCalories() {
        return this.getCalories(this.grams);
    }

    public Integer calculatedCarbos() {
        return this.getCarbos() * this.grams / GRAMS_PER_PORTION;

    }

    public Integer calculatedProteins() {
        return this.getProteins() * this.grams / GRAMS_PER_PORTION;


    }


    public Integer calculatedFats() {
        return this.getFats() * this.grams / GRAMS_PER_PORTION;


    }
}