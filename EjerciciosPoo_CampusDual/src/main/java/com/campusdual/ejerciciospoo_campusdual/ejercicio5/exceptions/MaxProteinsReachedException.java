package com.campusdual.ejerciciospoo_campusdual.ejercicio5.exceptions;

public class MaxProteinsReachedException extends MaxValuedReachedException{

    public MaxProteinsReachedException() {
        super("Max proteins reached for the actual diet");
    }
}
