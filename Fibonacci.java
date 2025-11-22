import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("les k premiers termes : ");
        int k = sc.nextInt();
        long a = 0, b = 1;
        System.out.print("Suite : ");
        for (int i = 0; i < k; i++) {
            System.out.print(a + " ");
            long tmp = a + b;
            a = b;
            b = tmp;
        }
        sc.close();
    }
}
