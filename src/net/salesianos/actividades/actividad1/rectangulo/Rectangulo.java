package net.salesianos.actividades.actividad1.rectangulo;
import net.salesianos.actividades.actividad1.calculoGeometrico.CalculoGeometrico;

public class Rectangulo implements CalculoGeometrico{
    private double altura;
    private double ancho;

    public Rectangulo(){
    }
    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        double resultado = this.ancho * this.altura;
        return resultado;
    }

    public double calcularPerimetro() {
        double resultado = 2 * (this.ancho + this.altura);
        return resultado;
    }
}
