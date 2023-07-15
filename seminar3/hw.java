package seminar3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * hw
 */
public class hw {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 2, 1, 65, 213, 234, 12));
        minimumValue(arr);
        maximumValue(arr);
        averageValue(arr);
        removingEvenNumbers(arr);
    }

    public static void averageValue(ArrayList<Integer> arr) {
        double av = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        av = sum / arr.size();
        System.out.println(av);
    }

    public static void maximumValue(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }

    public static void minimumValue(ArrayList<Integer> arr) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        int Min = (int) min;
        System.out.println(Min);
    }

    public static void removingEvenNumbers(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}