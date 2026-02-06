import java.util.Scanner;
public class q2_rotate90 {
    
    public static int[][] rotateMatrix90Clockwise(int[][] matrix) {
        int n = matrix.length;
        
        int[][] rotated = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        
        return rotated;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] originalMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                originalMatrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("Original Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] rotatedMatrix = rotateMatrix90Clockwise(originalMatrix);
        
        System.out.println("\nMatrix Rotated 90 Degrees Clockwise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
