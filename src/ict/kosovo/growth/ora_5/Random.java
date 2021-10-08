package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shkruaj nje numer nga 1-10: ");
        int numri = sc.nextInt();
        double random = Math.random();
        double r = (int)(random * 10) + 1;
        System.out.println(numri + " = " + r);
        if (numri == r){
            System.out.println("Urime, ja keni qelluar");
        }else {
            System.out.println("Suksese heren tjeter");
        }

    }
}
