import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de animal: ");
        String tipo = sc.next().toLowerCase();

        System.out.print("Edad del animal: ");
        int edad = sc.nextInt();

        String veterinario = "";
        boolean vacunacion = false;

        switch (tipo) {
            case "perro":
                veterinario = "veterinario canino";
                break;
            case "gato":
                veterinario = "veterinario felino";
                break;
            case "ave":
                veterinario = "veterinario de animales exóticos";
                break;
            default:
                veterinario = "veterinario general";
        }

        if ((tipo.equals("perro") || tipo.equals("gato")) && edad > 5) {
            vacunacion = true;
        }

        System.out.println("\n----- ASIGNACIÓN -----");
        System.out.println("Veterinario asignado: " + veterinario);

        if (vacunacion) {
            System.out.println("Recomendación: Vacunación adicional.");
        }
    }
}
