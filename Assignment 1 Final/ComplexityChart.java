package KimathiSedegah22237205;

public class ComplexityChart {

    public static void printComplexity(String title, int[] ns, double[] best, double[] avg, double[] worst) {
        System.out.println("=== " + title + " ===");
        System.out.printf("%-8s | %-8s | %-8s | %-8s%n", "n", "Best", "Average", "Worst");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < ns.length; i++) {
            System.out.printf("%-8d | %-8.0f | %-8.0f | %-8.0f%n", ns[i], best[i], avg[i], worst[i]);
        }

        // ASCII graph (stars)
        System.out.println("\nASCII Graph for Average Case:");
        for (int i = 0; i < ns.length; i++) {
            System.out.printf("n=%-5d | ", ns[i]);
            int stars = (int) (avg[i] / avg[avg.length - 1] * 50); // normalize to 50 max
            for (int s = 0; s < stars; s++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] ns = {10, 100, 1000, 5000, 10000};

        double[] maxElement = {10, 100, 1000, 5000, 10000}; // O(n)
        printComplexity("Max Element", ns, maxElement, maxElement, maxElement);

        double[] seqBest = {1, 1, 1, 1, 1};
        double[] seqAvg = {5, 50, 500, 2500, 5000};
        double[] seqWorst = {10, 100, 1000, 5000, 10000};
        printComplexity("Sequential Search", ns, seqBest, seqAvg, seqWorst);

        double[] bin = {4, 7, 10, 13, 14}; // log2(n)
        printComplexity("Binary Digit Count", ns, bin, bin, bin);

        double[] mat = {1000, 1000000, 1e9, 1.25e11, 1e12}; // O(n^3)
        printComplexity("Matrix Multiplication", ns, mat, mat, mat);

        double[] uniqBest = {10, 100, 1000, 5000, 10000}; // O(n)
        double[] uniqAvg = {45, 5000, 5e5, 1.25e7, 5e7};
        double[] uniqWorst = {90, 10000, 1e6, 2.5e7, 1e8};
        printComplexity("Unique Elements", ns, uniqBest, uniqAvg, uniqWorst);

        printComplexity("Gaussian Elimination", ns, mat, mat, mat);
    }
}
