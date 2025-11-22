import java.util.Scanner;

public class Primalite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("donner un nombre :");
        int n = sc.nextInt();
        boolean estPremier = n > 1;
        for (int i =2; i * i <= n && estPremier; i++) {
            if (n%i==0) estPremier = false;
        }
        System.out.println(estPremier ? "Premier" : "Non premier");
        sc.close();
    }
}
