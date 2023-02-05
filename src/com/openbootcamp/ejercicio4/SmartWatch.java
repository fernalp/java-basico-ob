package com.openbootcamp.ejercicio4;

public class SmartWatch extends SmartDevice{
    protected String conectividad;
    protected boolean presionArterial;
    protected boolean contadorPasos;

    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad='" + conectividad + '\'' +
                ", presionArterial=" + presionArterial +
                ", contadorPasos=" + contadorPasos +
                ", protecciónAgua=" + proteccionAgua +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    protected boolean proteccionAgua;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String modelo, String color, String conectividad, boolean presionArterial, boolean contadorPasos, boolean proteccionAgua) {
        super(marca, modelo, color);
        this.conectividad = conectividad;
        this.presionArterial = presionArterial;
        this.contadorPasos = contadorPasos;
        this.proteccionAgua = proteccionAgua;
    }
}
