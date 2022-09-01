package Matrix;

public interface MatrixInterface {
    void setValue(Integer row, Integer column, Integer value);

    Integer getValue(Integer row, Integer column);

    void printMatrix();

    Integer[][] getMatrix();
}
