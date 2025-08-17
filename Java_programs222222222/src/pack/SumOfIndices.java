package pack;

import java.util.*;

public class SumOfIndices {
    public List<Integer[]> sum(Integer y[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < y.length; i++) {
            int complement = target - y[i];
            if (map.containsKey(complement)) {
                 result.add(new Integer[] {map.get(complement), i});
            }
            // Store the current value and its index
            map.put(y[i], i);
        }
        System.out.println("list result------------->"+ result);
        return result;
    }

    public static void main(String[] args) {
        Integer y[] = {2, 4, 5, 1, 8, 91, 10};
        Integer target = 6;

        SumOfIndices s = new SumOfIndices();
        List<Integer[]> res = s.sum(y, target);

        if (res.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            for (Integer[] pair : res) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }
}
