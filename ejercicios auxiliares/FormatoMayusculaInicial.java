import java.util.Scanner;

public class FormatoMayusculaInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        char[] caracteres = sc.nextLine().toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            // Si es la primera letra o la letra después de un espacio
            if (i == 0 || caracteres[i - 1] == ' ') {
                caracteres[i] = Character.toUpperCase(caracteres[i]);
            }
        }

        System.out.println("Resultado: " + String.valueOf(caracteres));
    }
}