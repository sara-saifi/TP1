import java.util.Scanner;

public class ConversionCelsiusFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la temperature en C : ");
        float c = sc.nextFloat();
        float f = c * 9 / 5 + 32;
        System.out.println("la temperature en F : " + f);
        sc.close();
    }
}
