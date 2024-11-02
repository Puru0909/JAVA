import java.util.*;

public class Majelement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Get the set of keys (unique elements in the array)
        Set<Integer> keySet = map.keySet();

        // Find and print elements that appear more than n/3 times
        for (Integer key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
