import java.util.Scanner;

public class semana_dias_horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número total de horas: ");
        int totalHoras = scanner.nextInt();

        scanner.close();

        int semanas = totalHoras / (7 * 24);
        int horasRestantes = totalHoras % (7 * 24);

        int días = horasRestantes / 24;
        int horas = horasRestantes % 24;

        System.out.println(totalHoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + días + " días y " + horas + " horas.");
    }
}
