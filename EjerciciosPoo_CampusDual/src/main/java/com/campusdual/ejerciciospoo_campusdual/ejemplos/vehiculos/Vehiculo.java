package com.campusdual.ejerciciospoo_campusdual.ejemplos.vehiculos;

public abstract class Vehiculo {
    private Integer pasajeros;
    private Integer velocidadMax;
    private Integer potencia;
    private String marca;

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(Integer pasajeros, Integer velocidadMax, Integer potencia, String marca) {
        this.pasajeros = pasajeros;
        this.velocidadMax = velocidadMax;
        this.potencia = potencia;
        this.marca = marca;
    }

    public abstract void getDetails();

    public Integer calcularMovimiento(Integer segundos){
        return ((velocidadMax*segundos)*(potencia/pasajeros));
    }
}