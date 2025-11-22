import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("donner un entier : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact= fact*i;
        }

        System.out.println("le Factorielle est : " + fact);
        sc.close();
    }
}
