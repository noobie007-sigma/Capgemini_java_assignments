public class q4_matrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = {
                {3, 2},
                {7, 8}
        };
        int[][] res = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result of Matrix Multiplication:");
        for(int i = 0; i < res.length; i++) {
            for(int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
