import java.util.Scanner;

public class SommeN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("donner un nombre :");
        int n = sc.nextInt();
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme=somme+i;
        }
        System.out.println("la somme = " + somme);
//la boucle while
        somme=0;
        int i=1;
        while (i<=n) {
            somme=somme+i;
            i++;
        }
        System.out.println("la somme =" + somme);
        sc.close();
    }
}
