import java.util.Scanner;

public class cuadrado_suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();

        scanner.close();

        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;

        System.out.println("El resultado de (a + b)^2 es: " + resultado);
    }
}
