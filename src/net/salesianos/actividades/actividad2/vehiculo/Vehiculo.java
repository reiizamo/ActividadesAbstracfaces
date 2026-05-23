package net.salesianos.actividades.actividad2.vehiculo;

public abstract class Vehiculo {
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

    public void setColor(String color){
        this.color = color;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    public void setNumeroRuedas(int numeroRuedas){
        this.numeroRuedas = numeroRuedas;
    }

    public String getColor(){
        return this.color;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getNumeroPuertas(){
        return this.numeroPuertas;
    }
    public int getNumeroRuedas(){
        return this.numeroRuedas;
    }

    public abstract void arrancar();

    public abstract void motor();

    public abstract void mover();
}
