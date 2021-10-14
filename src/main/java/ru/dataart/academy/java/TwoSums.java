package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation

        int i = 0;
        boolean notFound = true;
        int[] res = new int[2];

        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (i <= lastIndex && notFound && nums[i] <= target) {
            firstIndex = i + 1;
            while (firstIndex <= lastIndex && notFound ) {
                int middIndex = (firstIndex + lastIndex) / 2;
                if (nums[i] + nums[middIndex] == target) {

                    res[0] = nums[i];
                    res[1] = nums[middIndex];
                    notFound = false;
                }
                else {
                    if (nums[i] + nums[middIndex] > target)
                        lastIndex = middIndex - 1;
                    else firstIndex = middIndex + 1;
                }

            }
            i++;
        }
        if (notFound) {
            int[] arr = new int[0];
            return arr;
        }
        else
            return res;
    }
}
