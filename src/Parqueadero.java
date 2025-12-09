import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de vehículo (auto/moto/bicicleta): ");
        String tipo = sc.next().toLowerCase();

        System.out.print("Hora de llegada (0-23): ");
        int hora = sc.nextInt();

        int costo = 0;

        switch (tipo) {
            case "auto":
                costo = 5000;
                break;
            case "moto":
                costo = 3000;
                break;
            case "bicicleta":
                costo = 1000;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        if (hora > 20) {
            costo *= 1.2;  // Recargo del 20%
        }

        System.out.println("\n----- TOTAL -----");
        System.out.println("Costo del parqueadero: $" + costo);
    }
}
