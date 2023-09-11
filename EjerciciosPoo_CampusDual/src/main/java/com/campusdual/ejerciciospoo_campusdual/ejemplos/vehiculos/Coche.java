package com.campusdual.ejerciciospoo_campusdual.ejemplos.vehiculos;

public class Coche extends Vehiculo{

    public String combustible;
    public Integer puertas;
    public String color;

    public Coche(Integer pasajeros, Integer velocidadMax, Integer potencia, String marca, String combustible, Integer puertas, String color) {
        super(pasajeros, velocidadMax, potencia, marca);
        this.combustible = combustible;
        this.puertas = puertas;
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getDetails() {
        System.out.println("Este coche tiene "+puertas+" puertas");
    }
}