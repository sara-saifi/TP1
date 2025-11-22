import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("Equilateral");
            else if (a == b || a == c || b == c)
                System.out.println("Isocele");
            else
                System.out.println("Scalene");
        } else {
            System.out.println("Ce n est pas un triangle valide.");
        }
        sc.close();
    }
}
