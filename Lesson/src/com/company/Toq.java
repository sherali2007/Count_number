package com.company;

public class Toq {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;

        for(int i=0; i<=a; i++){
            if( i % 2 == 1){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
