package edu.ashish.array;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class PascalTraiangle {

    public static void main(String[] args) {
        int rowNum = 5;
        int colNum = 3;
        int[][] pascalTriangle = createPascalTriangle(rowNum);
        int number = findElementInPascalTriangle(pascalTriangle, rowNum, colNum);
        System.out.println("Number at row " + rowNum + " and column " + colNum + " is " + number);
    }

    private static int findElementInPascalTriangle(int[][] pascalTriangle, int rowNum, int colNum) {
        return pascalTriangle[rowNum-1][colNum-1];
    }

    private static int[][] createPascalTriangle(int rowNum) {
        int [][] pascalTriangle = new int[rowNum][rowNum];
        for(int i=0; i< rowNum; i++) {
            for(int j=0; j<=i; j++) {
                if(j == 0 || i == j) {
                    pascalTriangle[i][j] = 1;
                    System.out.print(pascalTriangle[i][j] + " ");
                } else {
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                    System.out.print(pascalTriangle[i][j] + " ");
                }
            }
            System.out.println();
        }
        return pascalTriangle;
    }
}
