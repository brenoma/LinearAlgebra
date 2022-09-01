package LinearAlgebra;

import Matrix.MatrixImpl;

/**
 * LinearAlgebraImpl class.
 *
 */
public class LinearAlgebraImpl implements LinearAlgebraInterface {

    /**
     * Operation to transpose a matrix, by flipping a matrix over its diagonal.
     *
     * @param matrix     matrix to be transposed.
     * @return           an {@link Integer} containing the matrix after the operation.
     */
    @Override
    public Integer[][] transpose(MatrixImpl matrix) {

        final Integer MATRIX_ROW_SIZE = matrix.getMatrixRowSize();
        final Integer MATRIX_COLUMN_SIZE = matrix.getMatrixColumnSize();

        /**
         * Creation of an object based on size of rows and columns of A param.
         *
         */
        Integer[][] transposeResult = new Integer[MATRIX_COLUMN_SIZE][MATRIX_ROW_SIZE];


        /**
         * Iteration through matrices.
         */
        for (int row = 0; row < MATRIX_ROW_SIZE; row++) {
            for (int column = 0; column < MATRIX_COLUMN_SIZE; column++) {
                transposeResult[column][row] = matrix.getValue(row, column);
            }
        }
        matrix.printMatrix();
        System.out.println();
        printResults(transposeResult);
        return transposeResult;
    }

    /**
     * Operation of adding two matrices element by element.
     *
     * @param matrixA     A matrix.
     * @param matrixB     B matrix.
     * @return            an {@link Integer} containing the matrix after the operation.
     */
    @Override
    public Integer[][] sum(MatrixImpl matrixA, MatrixImpl matrixB) {
        /**
         * Check if sum is possible.
         *
         */
        if (matrixA.getMatrixRowSize() != matrixB.getMatrixRowSize() || matrixA.getMatrixColumnSize() != matrixB.getMatrixColumnSize()) {
            System.out.println("It's not possible to sum the matrices, because they're from different orders");
            return null;
        }

        final Integer MATRIX_ROW_SIZE = matrixA.getMatrixRowSize();
        final Integer MATRIX_COLUMN_SIZE = matrixA.getMatrixColumnSize();

        /**
         * Creation of an object based on size of rows and columns of A param.
         */
        Integer[][] sumResult = new Integer[MATRIX_ROW_SIZE][MATRIX_COLUMN_SIZE];

        /**
         * Iteration through matrices.
         */
        for (int row = 0; row < MATRIX_ROW_SIZE; row++) {
            for (int column = 0; column < MATRIX_COLUMN_SIZE; column++) {
                sumResult[row][column] = matrixA.getValue(row, column) + matrixB.getValue(row, column);
            }
        }

        this.printResults(sumResult);
        return sumResult;
    }

    /**
     * Operation of multiplying a scale number on each matrix element.
     *
     * @param k          Constant of multiply operation.
     * @param matrix     A matrix.
     * @return           an {@link Integer} containing the matrix after the operation.
     */
    @Override
    public Integer[][] times(Integer k, MatrixImpl matrix) {

        final Integer MATRIX_ROW_SIZE = matrix.getMatrixRowSize();
        final Integer MATRIX_COLUMN_SIZE = matrix.getMatrixColumnSize();

        /**
         * Creation of an object based on size of rows and columns of A param.
         */
        Integer[][] timesResult = new Integer[MATRIX_ROW_SIZE][MATRIX_COLUMN_SIZE];

        /**
         * Iteration through matrices.
         */
        for (int row = 0; row < MATRIX_ROW_SIZE; row++) {
            for (int column = 0; column < MATRIX_COLUMN_SIZE; column++) {
                timesResult[row][column] = matrix.getValue(row, column) * k;
            }
        }

        printResults(timesResult);
        return timesResult;
    }

    @Override
    public Integer[][] times(MatrixImpl matrixA, MatrixImpl matrixB) {

        if (matrixA.getMatrixRowSize() != matrixB.getMatrixRowSize() || matrixA.getMatrixColumnSize() != matrixB.getMatrixColumnSize()) {
            return null;
        }

        final Integer MATRIX_ROW_SIZE = matrixA.getMatrixRowSize();
        final Integer MATRIX_COLUMN_SIZE = matrixA.getMatrixColumnSize();

        Integer[][] timesResult = new Integer[MATRIX_ROW_SIZE][MATRIX_COLUMN_SIZE];

        for (int row = 0; row < MATRIX_ROW_SIZE; row++) {
            for (int column = 0; column < MATRIX_COLUMN_SIZE; column++) {
                timesResult[row][column] = matrixA.getValue(row, column) * matrixB.getValue(row, column);
            }
        }

        printResults(timesResult);
        return timesResult;
    }

    /**
     * Operation of multiplying a matrix by another matrix or a vector.
     *
     * @param a     A matrix.
     * @param b     B matrix.
     * @return      an {@link Integer} containing the matrix after the operation.
     */
    @Override
    public Integer[][] dot(Integer[][] a, Integer[][] b) {
        /**
         * Check if multiplication is possible.
         *
         */
        if (a[0].length != b.length) {
            System.out.println("Multiplication impossible");
            return null;
        }

        /**
         * Creation of an object based on size of rows of A param and columns of B param.
         */
        Integer[][] dotResult = new Integer[a.length][b[0].length];

        /**
         * Iteration through matrices.
         */
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < b[0].length; c++) {
                Integer sum = 0;
                for (int i = 0; i < b.length; i++) {
                    sum += a[r][i] * b[i][c];
                }
                dotResult[r][c] = sum;
            }
        }

        printResults(dotResult);
        return dotResult;
    }

    /**
     *
     * @param a
     * @return
     */
    @Override
    public Integer[][] gauss(Integer[][] a) {
        return new Integer[0][];
    }

    @Override
    public Integer[][] solve(Integer[][] a) {
        return new Integer[0][];
    }

    public void printResults(Integer[][] result) {
        for (int r = 0; r < result.length; r++) {
            for (int c = 0; c < result[0].length; c++) {
                System.out.print(result[r][c].toString() + " ");
            }
            System.out.println();
        }
    }
}
