package ict.kosovo.growth.basic;
import java.util.Scanner;
public class MenaxhimiRezultatit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ekipi vendas: ");
        String ekipiVendas = sc.nextLine();
        System.out.println("Ekipi mysafir: ");
        String ekipiMysafir = sc.nextLine();
        System.out.println("Numri i tifozeve: ");
        sc.nextLine();
        int nrTifozeve = sc.nextInt();
        System.out.println("Fusha/Arena: ");
        String arena = sc.nextLine();
        System.out.println("Sa gola ka shenuar " + ekipiVendas);
        int golaEkipiVendas = sc.nextInt();
        System.out.println("Sa gola ka shenuar " + ekipiMysafir);
        int golaEkipiMysafir = sc.nextInt();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Rezultati Perfundimtar");
        System.out.println(ekipiVendas + " vs " + ekipiMysafir + "   " + golaEkipiVendas + " - " + golaEkipiMysafir);
        System.out.println("Arena " + arena + " me gjithsej " + nrTifozeve);
        System.out.println("-------------------------------------------------------------");

    }
}
