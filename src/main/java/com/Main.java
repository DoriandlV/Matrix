package com;

import com.MatrixCalculator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the number " + "of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number " + "of columns of the matrix");
        n = in.nextInt();
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MatrixCalculator matrix = (MatrixCalculator) context.getBean("calculator");

        //MatrixCalculator matrix = new MatrixCalculator();
        int[][] a = matrix.generateRandomMatrix(n, m);
        int[][] b = matrix.generateRandomMatrix(n, m);


        //MatrixPrinter printer = new MatrixPrinter();
        MatrixPrinter printer = (MatrixPrinter) context.getBean("printer");
        printer.printMatrix(a, n, m);
        System.out.print("\n");
        printer.printMatrix(b, n, m);
        System.out.print("\n");

        int[][] sum = matrix.sum(a, b);
        printer.printMatrix(sum, n, m);


    }
}