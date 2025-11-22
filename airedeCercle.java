import java.util.Scanner;
import java.util.Locale;

public class airedeCercle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 
        System.out.print("Entrer le rayon du cercle : ");
        float r = sc.nextFloat();
        float aire = 3.14f * r * r;
        System.out.println("Aire du cercle = " + aire);
        sc.close();
    }
}
