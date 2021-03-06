package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com");
        MatrixCalculator matrix = context.getBean(MatrixCalculator.class);
        ConfigMatrix config = context.getBean(ConfigMatrix.class);
        MatrixPrinter printer = context.getBean(MatrixPrinter.class);
        //  ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
        //  ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsBeans.xml");
        //  MatrixCalculator matrix = (MatrixCalculator) context.getBean("calculator");
        //  MatrixPrinter printer = (MatrixPrinter) context.getBean("printer");

        Scanner in = new Scanner(System.in);
        int m, n;
        m = config.getRow();
        n = config.getColumn();
        //  System.out.println("Enter the number " + "of rows of the matrix");
        //  m = in.nextInt();
        // System.out.println("Enter the number " + "of columns of the matrix");
        // n = in.nextInt();

        int[][] a = matrix.generateRandomMatrix(n, m);
        int[][] b = matrix.generateRandomMatrix(n, m);


        printer.printMatrix(a, n, m);
        System.out.print("\n");
        printer.printMatrix(b, n, m);
        System.out.print("\n");

        int[][] sum = matrix.sum(a, b);
        printer.printMatrix(sum, n, m);

    }
}