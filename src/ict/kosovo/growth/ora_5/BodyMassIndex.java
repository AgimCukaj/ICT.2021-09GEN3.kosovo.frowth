package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruani peshen tuaj: ");
        int pesha = sc.nextInt();
        if (pesha > 90)
            System.out.println("Eshte mbi peshe");
        else if (pesha  >= 60 )
            System.out.println("Eshte peshe normale");
        else if (pesha <= 60 )
            System.out.println("Eshte nen peshe");
    }
}
