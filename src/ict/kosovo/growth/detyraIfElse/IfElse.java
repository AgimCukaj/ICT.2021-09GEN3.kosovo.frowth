package ict.kosovo.growth.detyraIfElse;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        int numri = 10;

        System.out.println(
                numri>0 ? "Numri eshte pozitiv" : "Numri eshte negativ"
        );

        int vleraAbsoluteENumrit = numri < 0 ? -numri : numri;

        System.out.println("Vlera absolute e numrit: " + vleraAbsoluteENumrit);
    }
}
