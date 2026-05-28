import java.util.Scanner;

public class ContadorVocalA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            // Comprobamos tanto 'a' como 'á' por si la frase tiene tildes
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'á') {
                contador++;
            }
        }
        System.out.println("La vocal 'A' aparece " + contador + " veces.");
    }
}