package com;

import com.MatrixCalculator;

import org.springframework.stereotype.Component;

@Component
public class MatrixPrinter {

    public void printMatrix(int M[][], int rowSize, int colSize) {

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
}
