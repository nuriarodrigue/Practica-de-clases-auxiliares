import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase con espacios: ");
        String fraseOriginal = sc.nextLine();

        String fraseSinEspacios = fraseOriginal.replace(" ", "");
        System.out.println("Resultado: " + fraseSinEspacios);
    }
}