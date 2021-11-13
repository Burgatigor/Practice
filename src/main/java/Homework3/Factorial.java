package Homework3;

public class Factorial {
    public static void main(String[] args) {
        for (int i =0; i <= 8; i++) {
            System.out.println(i + "! = " + factusual(i));
        }
    }
    private static int factusual(int i) {
        if(i == 0|| i ==1) return 1;
        int F = 1;
        for ( int n =1; n <= i; n++) {
            F *= n;
        }
        return F;
    }
}
