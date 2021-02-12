package cz.educanet.tranformations;

import kotlin.NotImplementedError;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix implements IMatrix {

    private final double[][] rawArray;

    public Matrix(double[][] rawArray) {
        this.rawArray = rawArray;
    }

    @Override
    public int getRows() {
        return rawArray.length;
    }

    @Override
    public int getColumns() {
        if (getRows() > 0)
            return rawArray[0].length;

        return 0;
    }

    @Override
    public IMatrix times(IMatrix matrix) {
        double [][] endMatrix = new double[getRows()][getColumns()];
        int whatever = 0;
        if (getColumns() == matrix.getColumns() && getRows() == matrix.getRows()){
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    endMatrix[i][j] = whatever;
                    for (int a = 0; a < getColumns(); a++) {
                        endMatrix[i][j] = endMatrix[i][j] + matrix.get(i,a) * matrix.get(a, j);
                    }
                }
            }
        }
        return MatrixFactory.create(endMatrix);
    }

    @Override
    public IMatrix times(Number scalar) {
        double [][] endScalar = new double[getRows()][getColumns()];
        int bruh;
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                bruh = (int) get(i, j);
                endScalar[i][j] = bruh * scalar.intValue();
            }

        }
        return MatrixFactory.create(endScalar);
    }

    @Override
    public IMatrix add(IMatrix matrix) {
        double [][] endAdd = new double[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                int a = (int) get(i, j);
                int b = (int) matrix.get(i, j);
            }

        }
        return MatrixFactory.create(endAdd);
    }

    @Override
    public double get(int n, int m) {
        return rawArray[n][m];
    }

    //region Optional
    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public double determinant() {
        return 0;
    }
    //endregion
    //region Generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;

        for (int i = 0; i < rawArray.length; i++) {
            if(!Arrays.equals(rawArray[i], matrix.rawArray[i]))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(rawArray);
    }
    //endregion
}
