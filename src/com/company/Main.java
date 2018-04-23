package com.company;

public class Main {

    public static double f(double x) {
        return 2*x+5;
    }

    public static void main(String[] args) {

        double x, y;
        int a = 0;
        int b = 10;

        int m = 1000;
        int c = 0;

        double max = 0;
        for(int i = a; i<b; i++) {
            if (max <= f((double)i)) {
                max = f((double)i);
            }
        }

        double min = 2000000000;
        for(int i = a; i<b; i++) {
            if (min >= f((double)i)) {
                min = f((double)i);
            }
        }

        for(int i = 0; i<m; i++) {
            x = a + (Math.random() * b);
            y = min + (Math.random() * max);
            if (f(x) <= y) {
                c++;
            }
        }

        System.out.println(c);

    }
}
