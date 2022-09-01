package Vector;

import java.util.Scanner;

public class VectorImpl implements VectorInterface {

    private Integer[][] vector;

    public VectorImpl(Integer dimLength) {
        Scanner sc = new Scanner(System.in);
        this.vector = new Integer[dimLength][1];

        for (int d = 0; d < vector.length; d++) {
            System.out.println(String.format("Enter an integer value for [%d]: ", d));
            this.vector[d][0] = sc.nextInt();
        }
    }

    @Override
    public void setValue(Integer dim, Integer value) {
        this.vector[dim][0] = value;
    }

    @Override
    public Integer getValue(Integer dim) {
        return this.vector[dim][0];
    }

    @Override
    public void printVector() {
        for (int d = 0; d < vector.length; d++) {
            System.out.print(vector[d][0].toString() + " ");
        }
    }

    public Integer[][] getVector() {
        return this.vector;
    }
}
