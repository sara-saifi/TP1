import java.util.Scanner;

public class BaremeNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sisir la note : ");
        double n= sc.nextDouble();

        char montion;
        if (n>= 16)
         montion = 'A';
        else if (n>= 14) 
         montion = 'B';
        else if (n>= 12) 
        montion = 'C';
        else if (n>= 10)
         montion = 'D';
        else montion = 'F';

        System.out.println("Mention est : " + montion);
        sc.close();
    }
}
