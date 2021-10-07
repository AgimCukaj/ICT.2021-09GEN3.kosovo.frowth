package ict.kosovo.growth.detyra.adhoc;
import java.util.Scanner;
public class Kalkulatori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtyp numrin e pare: ");
        int nrPare = sc.nextInt();
        System.out.println("Shtyp numrin e dyte: ");
        int nrDyte = sc.nextInt();

        int mbledhja = nrPare + nrDyte;
        int zbritja = nrPare - nrDyte;
        int shumezimi = nrPare * nrDyte;
        int pjestimi = nrPare / nrDyte;
        int modulo = nrPare % nrDyte;

        System.out.println("19 + 4 = " + mbledhja);
        System.out.println("19 - 4 = " + zbritja);
        System.out.println("19 * 4 = " + shumezimi);
        System.out.println("19 / 4 = " + pjestimi);
        System.out.println("19 % 4 = " + modulo);
    }
}
