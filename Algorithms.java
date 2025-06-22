
package KimathiSedegah22237205;

public class Algorithms {

    // MaxElement algorithm
    public double maxElement(double[] A) {
        double maxval = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxval) {
                maxval = A[i];
            }
        }
        return maxval;
    }

    // Sequential Search
    public int sequentialSearch(int[] A, int K) {
        int i = 0;
        while (i < A.length && A[i] != K) {
            i++;
        }
        return (i < A.length) ? i : -1;
    }

    // Binary length
    public int binaryLength(int n) {
        int count = 1;
        while (n > 1) {
            count += 1;
            n = n / 2;
        }
        return count;
    }

    // Matrix Multiplication
    public double[][] matrixMultiplication(double[][] A, double[][] B) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0.0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Unique Elements
    public boolean uniqueElements(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) return false;
            }
        }
        return true;
    }

    // Gaussian Elimination
    public void gaussianElimination(double[][] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i; k <= n; k++) {
                    A[j][k] = A[j][k] - A[i][k] * A[j][i] / A[i][i];
                }
            }
        }
    }
}
