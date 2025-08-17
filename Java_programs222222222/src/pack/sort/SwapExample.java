package pack.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SwapExample  {
    public static List<Integer> selectionSort(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        List<Integer> mutableList = new ArrayList<>(inputList);

        while (!mutableList.isEmpty()) {
            // Find the minimum element using Streams
            Integer min = mutableList.stream().min(Comparator.naturalOrder()).orElseThrow();
            
            // Add the minimum to the result list
            result.add(min);
            
            // Remove the minimum from the original list
            
           mutableList.remove(min);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(64, 25, 12, 22, 11);
        List<Integer> sortedNumbers = selectionSort(numbers);
        
        System.out.println("Sorted List: " + sortedNumbers);
    }
}