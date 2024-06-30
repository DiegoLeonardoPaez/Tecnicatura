import java.util.Scanner;

public class aprobacion_alumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Introduce la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Introduce la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        scanner.close();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno aprueba el curso con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno reprueba el curso con un promedio de: " + promedio);
        }
    }
}
