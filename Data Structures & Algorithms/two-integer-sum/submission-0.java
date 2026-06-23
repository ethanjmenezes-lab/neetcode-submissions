class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; 
        int[] numbers = new int[2];
        for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    {
                        int sum = nums[i] + nums[j];
                        if((sum == target) && (i != j))
                            {
                                 numbers[0] = i;
                                 numbers[1] = j;
                                return numbers;
                                
                            }
                    }
            }
            return numbers;
        
    }
}
