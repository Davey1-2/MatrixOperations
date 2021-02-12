package cz.educanet.tranformations;

public class Main {
    public static void main(String[] args) {
        double[][] a = {
                {1, 2, 3 },
                {4, 5, 6},
                {7, 8, 9}
        };
        IMatrix maticeA = MatrixFactory.create(a);

        double[][] b = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        IMatrix maticeB = MatrixFactory.create(b);
        IMatrix timesMatrix = maticeA.times(maticeB);
        System.out.println(timesMatrix);
        IMatrix timesScalar = maticeA.times(2);
        IMatrix timeScalar2 = maticeB.times(2);
        System.out.println(timesScalar);
        System.out.println(timeScalar2);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(timesScalar);
            }
            System.out.println();
        }
    }
}
