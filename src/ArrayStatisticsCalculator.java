import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayStatisticsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " number:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        double mean = calculateMean(array);
        System.out.println("Mean " +mean);
        double median = calculateMedian(array);
        System.out.println("Median " +median);
        double mode = calculateMode(array);
        System.out.println("Mode " +mode);
        double standarddeviation = calculateStandardDeviation(array);
        System.out.println("Standard Deviation " +standarddeviation);
    }

    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }

    public static int calculateMode(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static double calculateStandardDeviation(int[] array) {
        double sumSquaredDiff = 0;
        for (int num : array) {
            int mean = 0;
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / array.length);
    }
}
