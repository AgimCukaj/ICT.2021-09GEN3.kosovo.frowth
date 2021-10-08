package ict.kosovo.growth.ora_5;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int reverseNum = 0;
        System.out.println("enter an integeer: ");
        int num = reader.nextInt();
        do{
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }while (num < 0);
        System.out.println("That number reversed " + reverseNum);
    }
}
