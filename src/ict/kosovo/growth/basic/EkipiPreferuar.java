package ict.kosovo.growth.basic;
import java.util.Scanner;
public class EkipiPreferuar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkuaj ekipin tend te preferuar");
        String ekipiPreferuar = sc.nextLine();

        System.out.println("Ekipi yt i preferuar eshte: " + ekipiPreferuar);
    }
}
