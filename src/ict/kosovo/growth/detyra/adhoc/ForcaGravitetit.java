package ict.kosovo.growth.detyra.adhoc;
import java.util.Scanner;
public class ForcaGravitetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj masen: ");
        int m = sc.nextInt();
        System.out.println("Shkruaj gravitetin");
        int g = sc.nextInt();
        int f = m*g;

        System.out.println("Forca e Graviteti eshte: " + f);
    }
}
