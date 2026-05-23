package net.salesianos.actividades.actividad2.vehiculo;

public class Vehiculo {
    private String color;
    private int numeroPuertas;
    private int numeroRuedas;
    private String modelo;
    private String matricula;

    public Vehiculo(){
    }

    public Vehiculo(String color, String modelo, String matricula, int numeroPuertas, int numeroRuedas){
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    
}
