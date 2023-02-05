package com.openbootcamp.ejercicio4;

public class SmartDevice {
    protected String marca;
    protected String modelo;
    protected String color;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
