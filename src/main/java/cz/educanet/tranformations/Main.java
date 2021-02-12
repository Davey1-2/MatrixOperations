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
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        IMatrix maticeB = MatrixFactory.create(b);

        IMatrix timesMatrix = maticeA.times(maticeB);
        IMatrix timesScalar = maticeA.times(2);
        IMatrix matrixAdd = maticeA.add(maticeB);


        System.out.println("NASOBENI DRUHOU MATICI");
        for (int i = 0; i < timesMatrix.getRows(); i++) {
            for (int j = 0; j < timesMatrix.getColumns(); j++) {
                System.out.println(timesMatrix.get(i, j));
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("NASOBENI CISLEM");

        for (int i = 0; i < timesScalar.getRows(); i++) {
            for (int j = 0; j < timesScalar.getColumns(); j++) {
                System.out.println(timesScalar.get(i, j));
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("SOUCET");

        for (int i = 0; i < matrixAdd.getRows(); i++) {
            for (int j = 0; j < matrixAdd.getColumns(); j++) {
                System.out.println(matrixAdd.get(i, j));
            }
            System.out.println();
        }

    }
}
