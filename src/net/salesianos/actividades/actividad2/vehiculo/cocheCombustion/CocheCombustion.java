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

    public int getLitros(){
        return this.litrosCombustible;
    }
    public void setLitros(int litros){
        this.litrosCombustible = litros;
    }

    @Override
    public void arrancar() { 
        if(this.litrosCombustible <= 0){
            System.out.print("No hay combustible en el motor.\n");
            this.motorCombustion = "apagado";
            System.out.println("Motor: " + this.motorCombustion);
        }else{
            this.litrosCombustible = this.litrosCombustible - 1;
            this.motorCombustion = "encendido";
            System.out.print("Motor: " + this.motorCombustion + "\n");
            System.out.println("Un litro de combustible gastado.");
        }
    }
    public void pararMotor() {
        this.motorCombustion = "apagado";
        System.out.println("Motor: " + this.motorCombustion);
    }
    public void mover() {
        if(this.motorCombustion.equals("apagado")){
            System.out.println("El motor esta: " + this.motorCombustion);
        }else if(this.litrosCombustible <= 0){
            System.out.print("No hay combustible en el motor.\n");
            this.motorCombustion = "apagado";
            System.out.println("Motor: " + this.motorCombustion);
        }else {
            this.litrosCombustible = this.litrosCombustible - 1;
            System.out.println("Un litro de combustible gastado");
        }
        
    }
}
