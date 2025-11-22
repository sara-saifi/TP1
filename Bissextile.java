import java.util.Scanner;

public class Bissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner un annee : ");
        int an = sc.nextInt();

        boolean bissextile = (an% 4 == 0 && an% 100 != 0);

        if (bissextile)
            System.out.println("Annee est  bissextile");
        else
            System.out.println("Annee est non bissextile");

        sc.close();
    }
}
