import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor total de la compra: ");
        double total = sc.nextDouble();

        System.out.print("Cantidad de productos: ");
        int productos = sc.nextInt();

        System.out.print("¿Tiene membresía? (si/no): ");
        String membresia = sc.next().toLowerCase();

        if (membresia.equals("si")) {
            total *= 0.90;  // 10% descuento
        }

        if (productos > 10) {
            total *= 0.95;  // 5% adicional
        }

        System.out.println("\n----- FACTURA FINAL -----");
        System.out.println("Productos comprados: " + productos);
        System.out.println("Membresía: " + membresia);
        System.out.println("Total final a pagar: $" + total);
    }
}
