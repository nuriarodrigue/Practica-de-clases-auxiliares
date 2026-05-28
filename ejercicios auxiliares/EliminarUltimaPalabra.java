import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().trim();

        int posicionUltimoEspacio = frase.lastIndexOf(" ");

        if (posicionUltimoEspacio != -1) {
            String fraseRecortada = frase.substring(0, posicionUltimoEspacio);
            System.out.println("Frase resultante: " + fraseRecortada);
        } else {
            System.out.println("No hay suficientes palabras para eliminar la última.");
        }
    }
}