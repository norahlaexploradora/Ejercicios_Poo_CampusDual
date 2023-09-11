package com.campusdual.ejerciciospoo_campusdual.ejemplos.vehiculos;

public class ProbarVehiculos {

    public static void main(String[] args) {
        Coche panda = new Coche(4,120,5,"Panda","Gasolina",5,"rojo");
        panda.getDetails();
        Deportivo porche = new Deportivo(500,100,"Porche","Gasolina","rojo",1000);
        porche.getDetails();
    }

}