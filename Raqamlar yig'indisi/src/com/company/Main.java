package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 35;
        int sum = 0;

        for (int temp = n; temp != 0; temp = temp / 10) {
            sum =sum + temp % 10;
        }

        System.out.println(sum);

    }




















    }
}
