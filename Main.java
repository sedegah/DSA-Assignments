package KimathiSedegah_22237205;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithms algo = new Algorithms();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose algorithm:\n1. Bubble Sort\n2. Insertion Sort\n3. Linear Search");
        int choice = sc.nextInt();

        long start, end;
        switch (choice) {
            case 1:
                start = System.nanoTime();
                algo.bubbleSort(arr);
                end = System.nanoTime();
                System.out.println("Sorted Array (Bubble): " + Arrays.toString(arr));
                System.out.println("Time (ns): " + (end - start));
                break;

            case 2:
                start = System.nanoTime();
                algo.insertionSort(arr);
                end = System.nanoTime();
                System.out.println("Sorted Array (Insertion): " + Arrays.toString(arr));
                System.out.println("Time (ns): " + (end - start));
                break;

            case 3:
                System.out.println("Enter key to search:");
                int key = sc.nextInt();
                start = System.nanoTime();
                int index = algo.linearSearch(arr, key);
                end = System.nanoTime();
                if (index != -1) {
                    System.out.println("Key found at index: " + index);
                } else {
                    System.out.println("Key not found.");
                }
                System.out.println("Time (ns): " + (end - start));
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}