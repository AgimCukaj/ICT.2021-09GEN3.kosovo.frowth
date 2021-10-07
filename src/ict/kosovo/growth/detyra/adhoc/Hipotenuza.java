package ict.kosovo.growth.detyra.adhoc;
import java.util.Scanner;
public class Hipotenuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj brinjen e pare");
        int a = sc.nextInt();
        System.out.println("Shkruaj brinjen e dyte");
        int b = sc.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenuza e drejtkendeshit eshte " + c);
    }
}
