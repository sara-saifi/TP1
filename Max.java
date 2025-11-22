import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nombre :");
        int a = sc.nextInt();
        System.out.print("Entrer un nombre :");
        int b = sc.nextInt();
        System.out.print("Entrer un nombre :");
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("le max du 3 est :" + max);
        sc.close();
    }
}
