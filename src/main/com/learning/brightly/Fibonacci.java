package com.learning.brightly;

public class Fibonacci {

    public int printSeries(Integer n) throws Exception {

        int a = 0;
        int b = 1;
        int c =-1;

        if(n<0){
            throw new Exception("the Number should be bigger than 0");
        }

        for (int i=0 ; i < n-2 ; i ++) {

            c= a+b;
            a=b;
            b=c;

        }

        return c;
    }
}
