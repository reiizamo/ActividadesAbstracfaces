import java.util.Scanner;
import net.salesianos.actividades.actividad1.rectangulo.Rectangulo;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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
    }
}
