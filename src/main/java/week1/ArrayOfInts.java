package week1;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        if (arrayOfInts.length < 3) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null || arrayOfInts.length < x) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        int sum = 0;
        for (int i = 0; i < x; i++)
            sum += copy[copy.length - 1 - i];
        return sum;
    }

    public int countMostPopularNumber(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length == 0) return 0;
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        int maxCount = 0;
        int mostPopular = -1;

        for (int number: arrayOfInts) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);


            if (numberCount.get(number) > maxCount){
                maxCount = numberCount.get(number);
                mostPopular = number;

            }
        }

return mostPopular;
    }
}
