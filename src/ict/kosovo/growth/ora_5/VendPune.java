package ict.kosovo.growth.ora_5;

import java.util.Scanner;

public class VendPune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SHkruaj moshen tuaj: ");
        int age = sc.nextInt();
        System.out.println("Gjinia: ");
        String gjinia = sc.nextLine();
        System.out.println("Statusi martesor: ");
        String statusiMartesor = sc.nextLine();
        if (gjinia == "F") {
            System.out.println("Punon vetem ne zonat urbane");
        } else if (gjinia == "M" && age >= 20) {
            System.out.println("Mund te punoje kudo");
        } else if (gjinia == "M" && age == 60){
            System.out.println("Punon vetem ne zonat urbane");
        }else {
            System.out.println("Mosha gabim");
        }
    }
}

