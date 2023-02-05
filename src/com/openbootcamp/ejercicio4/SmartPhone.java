package com.openbootcamp.ejercicio4;

public class SmartPhone extends SmartDevice{
    protected int memoriaRam;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoriaRam=" + memoriaRam +
                ", capacidadAlmacenamiento=" + capacidadAlmacenamiento +
                ", procesador='" + procesador + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    protected int capacidadAlmacenamiento;
    protected String procesador;
    protected String sistemaOperativo;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, String color, int memoriaRam, int capacidadAlmacenamiento, String procesador, String sistemaOperativo) {
        super(marca, modelo, color);
        this.memoriaRam = memoriaRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
    }
}
