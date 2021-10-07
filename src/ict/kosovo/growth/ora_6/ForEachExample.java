package ict.kosovo.growth.ora_6;

public class ForEachExample {
    public static void main(String[] args) {
        int numrat[] = {10,87,22,34,55,43,21,25};
        int total = 0;
        for (int i = 0;i < numrat.length; i ++){
            total = numrat[i];
        }
        System.out.println(total);
        for (int numri:numrat) {
            total += numri;
        }
        System.out.println(total);
    }
}
