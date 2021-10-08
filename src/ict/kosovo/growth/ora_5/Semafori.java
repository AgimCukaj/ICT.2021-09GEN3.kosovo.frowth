package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class Semafori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semafori = sc.nextInt();

        if (semafori == 1){
            System.out.println("Semafori i kyq");
        }else if (semafori == 2 ){
            System.out.println("Semafori i verdhe");
        }else if (semafori == 3){
            System.out.println("Semafori gjelber");
        }else if (semafori == 4){
            System.out.println("Semafori eshte duke blinkuar");
        }else
            System.out.println("mungon rryma");
    }
}
