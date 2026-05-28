import java.util.Scanner;
public class ContadordePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("La frase está vacía.");
        } else {
            // Se divide por uno o más espacios en blanco
            String[] palabras = frase.split("\\s+");
            System.out.println("La frase contiene " + palabras.length + " palabras.");
        }
    }
}