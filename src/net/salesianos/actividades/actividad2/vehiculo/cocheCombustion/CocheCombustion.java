package net.salesianos.actividades.actividad2.vehiculo.cocheCombustion;
import net.salesianos.actividades.actividad2.vehiculo.Vehiculo;

public class CocheCombustion extends Vehiculo {
    private String motorCombustion = "encendido";
    private double litrosCombustible;

    public CocheCombustion(){
    }

    public CocheCombustion(String color, String modelo, String matricula, int numeroPuertas, int numeroRuedas, double litrosCombustible){
        super(color, modelo, matricula, numeroPuertas, numeroRuedas);
        this.litrosCombustible = litrosCombustible;

    }

    @Override
    public void arrancar() { 
    }
    public void motor() {
    }
    public void mover() {
    }
}
