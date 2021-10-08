package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        //Programi qe i kerkon nje perdoruesit nje tekst
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj nje tekst");
        String tekst = sc.nextLine();

        System.out.println("Ky tekst permban " + tekst.length() + " karaktere");
        System.out.println(tekst.lastIndexOf("a", 0));
        System.out.println(tekst.replace("pavarur", "independent"));

    }
}
