package edu.ashish.array;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class SpiralMatrixIterativeApproach {

    public static void main(String... args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=rowStart; i<=colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }

            for(int i=rowStart+1; i<=rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }

            for(int i=colEnd-1; i>=colStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
            }

            for(int i=rowEnd-1; i>colStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
    }

}
