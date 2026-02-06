import java.util.Scanner;
public class q1_transpose {
    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;    
        
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] originalMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalMatrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println("Original Matrix:");
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] transposedMatrix = transposeMatrix(originalMatrix);
        
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
