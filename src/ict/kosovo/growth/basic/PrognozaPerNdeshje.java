package ict.kosovo.growth.basic;
import java.util.Scanner;
public class PrognozaPerNdeshje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rezultati i ndeshjes Cekia vs Kosova");

        System.out.println("Sa gola shenon ekipi vendas");
        int ekipiVendas = sc.nextInt();

        System.out.println("Sa gola shenon ekipi mysafir");
        int ekipiMysafir = sc.nextInt();

        System.out.println("Cekia vs Kosova " + ekipiVendas + " - " + ekipiMysafir);
    }
}
