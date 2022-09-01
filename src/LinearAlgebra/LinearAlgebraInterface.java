package LinearAlgebra;

import Matrix.MatrixImpl;

public interface LinearAlgebraInterface {
    Integer[][] transpose(MatrixImpl matrix);

    Integer[][] sum(MatrixImpl matrixA, MatrixImpl matrixB);

    Integer[][] times(Integer k, MatrixImpl matrix);

    Integer[][] times(MatrixImpl matrixA, MatrixImpl matrixB);

    Integer[][] dot(Integer[][] a, Integer[][] b);

    Integer[][] gauss(Integer[][] a);

    Integer[][] solve(Integer[][] a);

    void  printResults(Integer[][] results);
}
