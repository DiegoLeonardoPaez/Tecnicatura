import java.util.Scanner;

public class precio_final {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el monto total de la compra: $");
        double montoCompra = scanner.nextDouble();

        scanner.close();

        double montoFinal;
        if (montoCompra > 100) {
            double descuento = montoCompra * 0.20;
            montoFinal = montoCompra - descuento;
        } else {
            montoFinal = montoCompra;
        }

        System.out.println("El precio final a pagar es: $" + montoFinal);
    }
}
