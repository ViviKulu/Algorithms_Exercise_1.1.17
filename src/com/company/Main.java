package com.company;

public class Main {

    //    Criticize the following recursive function:
    //    public static String exR2(int n){
    //        String s = exR2(n-3) + n + exR2(n-2) + n;
    //        if (n <= 0) return "";
    //        return s;
    //    }

    //    Answer:
    //
    //    The base case will never be reached. A call to exR2(3) will result in calls to
    //    exR2(0), exR2(-3), exR3(-6), and so forth until a StackOverflowError occurs.

    public static void main(String[] args) {
        // write your code here
        int n = 6;
        exR2(n);
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
