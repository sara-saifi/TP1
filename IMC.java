import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner la masse (kg) : ");
        float m = sc.nextFloat();
        System.out.print("Donner la taille (m) : ");
        float t = sc.nextFloat();
        float imc = m / (t * t);
        System.out.printf("IMC = ", +imc);
        sc.close();
    }
}
