package MenuOptions.Operations;

import LinearAlgebra.LinearAlgebraImpl;
import Matrix.MatrixImpl;

import java.util.Scanner;

public class Transpose extends AbstractOperation {

//    private final String className = this.getClass().getSimpleName();
//
//    private static Scanner sc = new Scanner(System.in);
//
//    private static LinearAlgebraImpl linearAlgebra = new LinearAlgebraImpl();
//
//    private static MatrixImpl matrix;
//
//    private static Integer rowsLength;
//
//    private static Integer columnsLength;

    public void start() {
        AbstractOperation.printMenu(className);
        createMatrix(rowsLength, columnsLength);

        linearAlgebra.transpose(matrix);
    }



    private static void createMatrix(Integer rowsLength, Integer columnsLength) {

        System.out.print("| Define nº of rows: ");
        rowsLength = sc.nextInt();
        System.out.print("| Define nº of columns: ");
        columnsLength = sc.nextInt();

        matrix = new MatrixImpl(rowsLength, columnsLength);
    }
}
