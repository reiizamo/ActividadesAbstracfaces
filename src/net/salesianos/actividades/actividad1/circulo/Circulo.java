package net.salesianos.actividades.actividad1.circulo;
import net.salesianos.actividades.actividad1.calculoGeometrico.CalculoGeometrico;

public class Circulo implements CalculoGeometrico{
    private double radio;

    public Circulo(){
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI * Math.pow(this.radio, 2);
        return resultado;
    }

    public double calcularPerimetro() {
        double resultado = 2 * Math.PI * this.radio;
        return resultado;
    }
}
