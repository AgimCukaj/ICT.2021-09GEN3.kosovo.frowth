package ict.kosovo.growth.ora_6;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int array[] = {87,54,34,24,56,76,88,98,99};
        int total = 0;
        for (int number : array)
            total += number;
        System.out.printf("Total of array elements: %d%n" + total);
    }
}
