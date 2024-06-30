import java.util.Scanner;

public class operacion_segun_num {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        double resultado;
        if (numero1 == numero2) {
            resultado = numero1 * numero2;
            System.out.println("Los números son iguales. La multiplicación es: " + resultado);
        } else if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.println("El primer número es mayor que el segundo. La resta es: " + resultado);
        } else {
            resultado = numero1 + numero2;
            System.out.println("El primer número es menor que el segundo. La suma es: " + resultado);
        }
    }
}
