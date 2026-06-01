class Solution {
    public void setZeroes(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        boolean firstRow = false;
        boolean firstColumn = false;

        //check the 1st row and column as zeros
        for (int i = 0; i < a; i++) {
            if (matrix[i][0] == 0)
                firstColumn = true;
        }
        for (int j = 0; j < b; j++) {
            if (matrix[0][j] == 0)
                firstRow = true;
        }
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < b; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < b; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if (firstRow) {
            for (int j = 0; j < b; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColumn) {
            for (int i = 0; i < a; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}