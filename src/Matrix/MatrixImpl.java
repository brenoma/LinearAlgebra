package Matrix;

import java.util.Scanner;

public class MatrixImpl implements MatrixInterface {

    private Integer[][] matrix;

    public MatrixImpl(final Integer rowsLength, final Integer columnLength) {
        Scanner sc = new Scanner(System.in);

        this.matrix = new Integer[rowsLength][columnLength];
        for (int r = 0; r < rowsLength; r++) {
            for (int c = 0; c < columnLength; c++) {
                System.out.println(String.format("Enter an integer value for [%d][%d]: ", r, c));
                this.matrix[r][c] = sc.nextInt();
            }
        }
    }

    @Override
    public void setValue(final Integer row, final Integer column, final Integer value) {
        this.matrix[row][column] = value;
    }

    @Override
    public Integer getValue(final Integer row, final Integer column) {
        return this.matrix[row][column];
    }

    public void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(this.matrix[row][column].toString() + " ");
            }
            System.out.println();
        }
    }

    public Integer[][] getMatrix() {
        return this.matrix;
    }

    public Integer getMatrixRowSize() { return this.matrix.length; }

    public Integer getMatrixColumnSize() { return this.matrix[0].length; }
}
