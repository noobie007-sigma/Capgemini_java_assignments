public class q3_flipMatrix {

    public static int[][] flipHorizontally(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] flipped = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flipped[i][j] = matrix[i][cols - 1 - j];
            }
        }

        return flipped;
    }


    public static int[][] flipVertically(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] flipped = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flipped[rows - 1 - i][j] = matrix[i][j];
            }
        }

        return flipped;
    }

    public static int[][] flipMatrix(int[][] matrix, char direction) {
        if (direction == 'H') {
            return flipHorizontally(matrix);
        } else if (direction == 'V') {
            return flipVertically(matrix);
        } else {
            System.out.println("Invalid direction. Use 'H' for horizontal or 'V' for vertical.");
            return matrix;
        }
    }

    public static void main(String[] args) {

        int[][] originalMatrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        char ch = 'H';


        System.out.println("Original Matrix:");
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }


        int[][] result = flipMatrix(originalMatrix, ch);
        System.out.println("\nMatrix after flipping in " + (ch == 'H' ? "horizontal " : "vertical ") + " direction");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
