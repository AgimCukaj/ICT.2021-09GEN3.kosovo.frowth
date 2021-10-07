package ict.kosovo.growth.detyra.adhoc;
import java.util.Scanner;

public class LigjiNjutonit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj masen e trupit");
        int m = sc.nextInt();
        System.out.println("Shkruaj nxitimin e trupit");
        int a = sc.nextInt();
        int f = m * a;

        System.out.println("Forca eshte " + f);
    }
}
