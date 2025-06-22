
package KimathiSedegah22237205;

public class Main {
    public static void main(String[] args) {
        Algorithms algo = new Algorithms();

        // Mock Data
        double[] array = {2.3, 4.5, 1.2, 9.8};
        int[] intArray = {5, 3, 9, 1, 3};

        System.out.println("Max Element: " + algo.maxElement(array));
        System.out.println("Sequential Search (key=9): " + algo.sequentialSearch(intArray, 9));
        System.out.println("Binary Length (n=10): " + algo.binaryLength(10));
        System.out.println("Unique Elements: " + algo.uniqueElements(intArray));

        double[][] A = {{1, 2}, {3, 4}};
        double[][] B = {{2, 0}, {1, 2}};
        double[][] C = algo.matrixMultiplication(A, B);

        System.out.println("Matrix Multiplication:");
        for (double[] row : C) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        double[][] G = {{2, 1, -1, 8}, {-3, -1, 2, -11}, {-2, 1, 2, -3}};
        algo.gaussianElimination(G);
        System.out.println("Gaussian Elimination Matrix:");
        for (double[] row : G) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}
