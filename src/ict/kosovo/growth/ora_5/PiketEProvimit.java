package ict.kosovo.growth.ora_5;

import java.util.Scanner;

public class PiketEProvimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Piket e provimit: ");

        int piket = sc.nextInt();
        String nota;


        if (piket < 50) {
            nota = " nota 5";
            System.out.println(nota);
        } else if (piket < 60) {
            nota = "Nota 6";
            System.out.println(nota);
        } else if (piket < 70) {
            nota = "Nota 7";
            System.out.println(nota);
        } else if (piket < 80) {
            nota = "Nota 8";
            System.out.println(nota);
        } else if (piket < 90) {
            nota = "Nota 9";
            System.out.println(nota);
        } else if (piket <= 100) {
            nota = "Nota 10";
            System.out.println(nota);
        }
    }
}

