package com;


import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class MatrixCalculator {


    public int[][] generateRandomMatrix(int rowSize ,int colSize ){
        Random r=new Random();

        int[][] matrix =new int[rowSize][colSize];

        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                matrix[i][j]=r.nextInt(50);
            }
        }
        return matrix;
    }

    public  int [][] sum (int a[][],int b[][]){
        int row = a.length;
        int column= a[0].length;

        int sum [][] = new int[row][column] ;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++) {
               sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
