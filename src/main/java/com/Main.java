package com;

import com.MatrixCalculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the number "
                + "of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number "
                + "of columns of the matrix");
        n = in.nextInt();

        MatrixCalculator matrix = new MatrixCalculator();
        int[][] a = matrix.generateRandomMatrix(n, m);
        int[][] b = matrix.generateRandomMatrix(n, m);


        MatrixPrinter printer = new MatrixPrinter();
        printer.printMatrix(a, n, m);
        System.out.print("\n");
        printer.printMatrix(b, n, m);
        System.out.print("\n");

        int[][] sum = matrix.sum(a, b);
        printer.printMatrix(sum, n, m);


    }
}