import java.util.Scanner;

public class RotateMatrixWithExtraSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int matrix[][] = new int[n][n];
        for(int i =0;i<matrix.length;i++){
            for(int j =0 ;j<matrix.length;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        rotateit(matrix);
        in.close();

    }

    private static void rotateit(int[][] matrix) {
        int newmatrix[][] = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
            for(int j =0 ;j<matrix.length;j++){
                newmatrix[j][i] =  matrix[matrix.length-1-i][j] ;
            }
            for(int i =0;i<matrix.length;i++){
                for(int j =0 ;j<matrix.length;j++){
                    System.out.print(newmatrix[i][j]+" ");
                }
                System.out.print("\n");
            }
    }
}

// 1 2 3      7 4 1
// 4 5 6  ==  8 5 2
// 7 8 9      9 6 3

// matrix[n-i][j] = matrix[j][i]

// 7           7