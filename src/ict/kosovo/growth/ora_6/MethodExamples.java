package ict.kosovo.growth.ora_6;

public class MethodExamples {
    public static void main(String[] args) {

        System.out.println(max(20, 10));
    }
    private static int max(int x, int y){
        if (x < y)
            return x;
        else return y;
    }
}
