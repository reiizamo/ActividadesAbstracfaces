package net.salesianos.actividades.actividad2.vehiculo.cocheCombustion;
import net.salesianos.actividades.actividad2.vehiculo.Vehiculo;

public class CocheCombustion extends Vehiculo {
    private String motorCombustion = "apagado";
    private int litrosCombustible;

    public CocheCombustion(){
    }

    public CocheCombustion(String color, String modelo, String matricula, int numeroPuertas, int numeroRuedas, int litrosCombustible){
        super(color, modelo, matricula, numeroPuertas, numeroRuedas);
        this.litrosCombustible = litrosCombustible;

    }

    @Override
    public void arrancar() { 
        if(this.litrosCombustible == 0){
            System.out.print("No hay combustible en el motor.");
            System.out.println("Motor: " + this.motorCombustion);
        }else{
            this.litrosCombustible = this.litrosCombustible - 1;
            System.out.print("Motor: " + this.motorCombustion);
            System.out.println("Un litro de combustible gastado.");
        }
    }
    public void motor() {
    }
    public void mover() {
    }
}
