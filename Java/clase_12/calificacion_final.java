import java.util.Scanner;

public class calificacion_final {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la calificación de participación (10%): ");
        double participacion = scanner.nextDouble();

        System.out.print("Introduce la calificación del primer examen parcial (25%): ");
        double primerParcial = scanner.nextDouble();

        System.out.print("Introduce la calificación del segundo examen parcial (25%): ");
        double segundoParcial = scanner.nextDouble();

        System.out.print("Introduce la calificación del examen final (40%): ");
        double examenFinal = scanner.nextDouble();

        scanner.close();

        double calificacionFinal = participacion * 0.10 +
                                   primerParcial * 0.25 +
                                   segundoParcial * 0.25 +
                                   examenFinal * 0.40;

        System.out.println("La calificación final es: " + calificacionFinal);
    }
}
