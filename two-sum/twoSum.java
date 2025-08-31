
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}

/*
 * Find two numbers in an array that add up to a specific target.
 *
 * 1. Create a hash map to store the numbers and their indices.
 * 2. Iterate through the array, for each number calculate its complement.
 * 3. If the complement exists in the map, return the pair of indices.
 * 4. If no pair is found, throw an exception.
 */