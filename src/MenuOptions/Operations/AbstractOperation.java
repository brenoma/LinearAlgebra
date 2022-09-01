package MenuOptions.Operations;

import LinearAlgebra.LinearAlgebraImpl;
import Matrix.MatrixImpl;

import java.util.Scanner;

public abstract class AbstractOperation {

    protected final String className = this.getClass().getSimpleName();

    protected static Scanner sc = new Scanner(System.in);

    protected static LinearAlgebraImpl linearAlgebra = new LinearAlgebraImpl();

    protected static MatrixImpl matrix;

    protected static Integer rowsLength;

    protected static Integer columnsLength;

    protected static void printMenu(String className) {
        System.out.println("|------------------------------------------------------|");
        System.out.println("|                Transpose of a matrix                 |");
        System.out.println("|------------------------------------------------------|");
        System.out.println(className);
    }
}
