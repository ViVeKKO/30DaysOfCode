import java.util.Scanner;

public class RotateMatrixInPlace {
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
        // int newmatrix[][] = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
            for(int j =0 ;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[j][i] ;
                matrix[j][i] = temp;
            }
            
          for(int i=0;i<matrix.length;i++){
              int k = matrix.length - 1;
              for(int j=0;j<k;j++){
                  int temp = matrix[j][i];
                  matrix[j][i] = matrix[k][i];
                  matrix[k][i] = temp;
                  k--;
              }
          }
    }
}
