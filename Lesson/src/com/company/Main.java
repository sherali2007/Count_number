package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for(int i=0; i<100; i++){
            if(i % 3 == 0){
                count ++;
                sum = sum + i;
            }
        }

        System.out.println("yig'indi = " + sum);
        System.out.println("soni = " + count);

    }
}
