package week2;

import java.util.*;

public class ArrayOfInts {
    int sumOfUniqueValidNumbers(int[] numbers) {
        if (numbers == null) return 0;
        Set<Integer> set = new HashSet<>();
        for (int number : numbers){
            if (number <= 1000)
                set.add(number);
            if (number < 0){
                throw new IllegalArgumentException("no negative numbers allowed");
            }
        }
        int sum = 0;
        for (int number : set) {
            sum += number;
        }
        return sum;

    }

    int[] findCommonElements(int[] array1, int[] array2){
        if (array1 == null || array2 == null){
            throw new IllegalArgumentException("array is not defined");
        }
        if (array1.length == 0 || array2.length == 0) return new int[]{0};

        Set <Integer> set1 = new HashSet<>();
        for (int number: array1){
            set1.add(number);
        }

        Set <Integer> set2 = new HashSet<>();
        for (int number: array2){
            set2.add(number);
        }

        // retainAll haalt plaatst alle elementen in set2 die ook in set1 voorkomen
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (int number : set1){
            result[i++] = number;
        }
        return result;
    }

    int[] findDuplicateValues(int[] array){
        if (array.length == 0) return new int[0];
        if (array == null){
            throw new NullPointerException("array not defined");
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int number : array){
            countMap.put(number,countMap.getOrDefault(number,0)+1);
        }
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if (entry.getValue() > 1){
                duplicatesList.add(entry.getKey());
            }
        }

        int[] duplicatesArray = new int[duplicatesList.size()];
        for (int i = 0; i < duplicatesList.size(); i++) {
            duplicatesArray[i] = duplicatesList.get(i);

        }


        return duplicatesArray;
    }

}
