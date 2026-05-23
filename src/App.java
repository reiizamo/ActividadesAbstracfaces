import java.util.Scanner;
import net.salesianos.actividades.actividad1.circulo.Circulo;
import net.salesianos.actividades.actividad1.rectangulo.Rectangulo;
import net.salesianos.actividades.actividad2.vehiculo.cocheCombustion.CocheCombustion;


public class App {
    public static void main(String[] args) throws Exception {
        // Actividad 1
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduce, la altura y el ancho de un rectangulo:");

        System.out.print("altura: ");
        double altura = sc.nextDouble();

        System.out.print("ancho: ");
        double ancho = sc.nextDouble();
        System.out.println();

        Rectangulo rectangulo = new Rectangulo(altura, ancho);
        System.out.print("El rectángulo de base: " + rectangulo.getAncho() + " y altura: " + rectangulo.getAltura() + "\n");
        System.out.print("Tiene un área de: " + rectangulo.calcularArea() + "\n");
        System.out.println("Tiene un perímetro de: " + rectangulo.calcularPerimetro());


        System.out.println();
        System.out.println("Introduce, el radio del circulo:");

        System.out.print("radio: ");
        double radio = sc.nextDouble();
        System.out.println();

        Circulo circulo = new Circulo(radio);
        System.out.print("El circulo tiene un radio de: " + circulo.getRadio() + "\n");
        System.out.print("Tiene un área de: " + circulo.calcularArea() + "\n");
        System.out.println("Tiene un perímetro de: " + circulo.calcularPerimetro());
        sc.close();


        // Actividad 2
        CocheCombustion coche = new CocheCombustion("Rojo", "celica", "4587 TNF", 4, 4, 20);
        System.out.println();
        coche.mover();
        System.out.println();

        coche.arrancar();
        System.out.println();

        coche.mover();
        coche.mover();
        coche.mover();
        System.out.println();

        System.out.print("Tiene: " + coche.getLitros() + "L de combustible\n");

        coche.setLitros(2);
        coche.mover();
        coche.mover();
        coche.mover();

    }
}
