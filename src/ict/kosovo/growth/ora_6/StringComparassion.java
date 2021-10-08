package ict.kosovo.growth.ora_6;
import java.util.Scanner;
public class StringComparassion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shkruaj emrin e pare: ");
        String name1 = sc.nextLine();
        System.out.println("Shkruaj emrin e dyte: ");
        String name2 = sc.nextLine();

        System.out.println(name1.equals(name2));

        if (name1.equals("Agim cukaj")){
            System.out.println("po eshte agim cukaj");
//        }else if (name2.compareToIgnoreCase()){

        }


    }
}
