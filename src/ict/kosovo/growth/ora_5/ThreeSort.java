package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtyp numrin e pare: ");
        int a = sc.nextInt();
        System.out.println("Shtyp numrin e dyte: ");
        int b = sc.nextInt();
        System.out.println("Shtyp numrin e trete: ");
        int c = sc.nextInt();



        if (a > b && a > c){
            System.out.println(a = 1);
            System.out.println(b);
            System.out.println(c = 1234);
        }else if (b < a && b < 1){
            System.out.println(a = 1);
            System.out.println(b);
            System.out.println(c = 1234);
        }else if(c < b && c < a){
            System.out.println(c = 1234);
            System.out.println(b);
            System.out.println(a = 1);
        }else{
            System.out.println("Numbers are not in order");
        }
        System.out.println("This line of code will always excecute");

    }
}
