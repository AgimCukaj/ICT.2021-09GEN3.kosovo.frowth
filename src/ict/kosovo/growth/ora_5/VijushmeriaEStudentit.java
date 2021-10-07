package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class VijushmeriaEStudentit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numri i oreve te mbajtura: ");
        int nrOreveTeMbajtura = sc.nextInt();
        System.out.println("Numri i oreve te ndjekura: ");
        int nrOreveTeNdjekura = sc.nextInt();
        int vijushmeria = (nrOreveTeNdjekura * 100) / nrOreveTeMbajtura;
        if (vijushmeria < 75){
            System.out.println("Studenti nuk lejohet te hyj ne provim. Vijushmeria eshte: " + vijushmeria + "%");
        }else
            System.out.println("Studenintit i lejohet pjesmrrja ne provim. Vijushmeria e tij eshte: " + vijushmeria + "%");

    }
}
