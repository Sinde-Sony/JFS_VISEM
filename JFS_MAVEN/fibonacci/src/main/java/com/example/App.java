package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for input at runtime
        System.out.print("Enter how many Fibonacci numbers you want: ");
        int n = sc.nextInt();  // input taken at runtime

        int first = 0, second = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
