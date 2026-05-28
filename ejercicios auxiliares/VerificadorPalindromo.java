import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        // Quitamos espacios y pasamos a minúsculas para una comparación real
        String original = sc.nextLine().toLowerCase().replace(" ", "");

        // Invertimos la cadena
        String invertida = new StringBuilder(original).reverse().toString();

        if (original.equals(invertida)) {
            System.out.println("Es palíndroma.");
        } else {
            System.out.println("No es palíndroma.");
        }
    }
}