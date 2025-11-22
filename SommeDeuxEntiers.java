import java.util.Scanner;

public class SommeDeuxEntiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nombre :");
        int a = sc.nextInt();
        System.out.print("Entrer un nombre :");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("Somme = " + c);
        sc.close();
    }
}
