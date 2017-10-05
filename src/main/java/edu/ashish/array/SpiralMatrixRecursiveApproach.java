package edu.ashish.array;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class SpiralMatrixRecursiveApproach {

    public static void main(String... args) {

        int[][] matrix = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        spiral(matrix,0, matrix.length-1, 0, matrix[0].length-1);


    }

    private static void spiral(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd) {

        for(int i=colStart; i<=colEnd; i++) {
            System.out.print(matrix[rowStart][i] + " ");
        }

        for(int i=rowStart+1; i<=rowEnd; i++) {
            System.out.print(matrix[i][colEnd] + " ");
        }

        for(int i=colEnd-1; i>=colStart; i--) {
            System.out.print(matrix[rowEnd][i] + " ");
        }

        for(int i=rowEnd-1; i>rowStart; i--) {
            System.out.print(matrix[i][colStart] + " ");
        }

        if(rowStart+1 <= rowEnd-1 && colStart+1 <= colEnd-1)
            spiral(matrix, ++rowStart, --rowEnd, ++colStart, --colEnd);

    }


}
