package ict.kosovo.growth.ora_7;

public class InitArray {
    public static void main(String[] args) {
//        int [] array = new int[10];
//        System.out.printf("%5d,%8d%n", "Index", "Value");
//
//        for (int counter = 0; counter < array.length; counter++){
//            System.out.printf("%5d,%8d,%n", counter, array[counter]);
//        }

        int [] array = {32,24,25,26,33,45,6,7,123,48,65,43};
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter ++)
            System.out.printf("%d%8d%n", counter, array[counter]);
    }
}
