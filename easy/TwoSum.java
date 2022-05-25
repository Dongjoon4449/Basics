package easy;

import java.util.Arrays;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        
        int value;
        
        for(int i1 = 0; i1 < nums.length; i1++) {
            for(int i2 = i1 + 1; i2 < nums.length; i2++) {
                value = nums[i1] + nums[i2];
                if(value == target) {
                    return new int[] {i1, i2}; // we can return array like this!
                }
            }
        }
        
        
        return null; // In case there is not solution, we'll just return null
        
    }
    
    
    public static void main(String[] args) {
        int[] nums = {3, 3};
        
        System.out.println(Arrays.toString(twoSum(nums, 6)));

    }

}
