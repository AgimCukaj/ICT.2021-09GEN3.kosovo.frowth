package ict.kosovo.growth.ora_6;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner reder = new Scanner(System.in);
        System.out.println("Shkruaj nje numur");

        int i = reder.nextInt();
        while (i <= 3){
            int j = i % 2;
            i++;
            System.out.println("Numur i plotepjestueshem me 2: " + j);
        }















//        Scanner reader = new Scanner(System.in);
////        int res = 0;
////
////        System.out.println("Enter two intetgers: ");
////        int num1 = reader.nextInt();
////        int num2 = reader.nextInt();
////        while((res +1) * num1 < num2)
////            res ++;
////        System.out.println("Num1 contains Num2 " + res + " times");
//
////        int res = 0;
////        System.out.println("Enter a positive number: ");
////        int num = reader.nextInt();
////        while (num > 0){
////            res += num % 10;
////            num /= 10;
////        }
////        System.out.println(" res = " + res);
//
//
//        int count = 1;
//        while (count != 50) {
//            count += 2;
//            System.out.println(count);
//        }
//
//
////        int count = 2;
////        while (count <= 100){
////            count++;
////            System.out.println(count);
////        }
//
//
//        int counter = 2;
//        while (counter <= 5) {
//            System.out.println("Welcome to java");
//            counter++;
//        }
////        int sum = 0;
////        int count = 0;
////
////        while (count<10){
////            count++;
////            sum+= count;
////        }
////        double avg =(double) sum / count;
////        System.out.println("Average " + avg);
////    }
    }
}
