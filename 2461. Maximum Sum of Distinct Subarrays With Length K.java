class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    int i = 0, j = 0, len = nums.length;
        long maxSum = 0;
        long local = 0;
        HashSet<Integer> set = new HashSet<>();

        while(j < len) {
            int curr = nums[j];
            local += curr;
            if(set.contains(curr)) {  
                while(i < j && set.contains(curr)) {
                   int first = nums[i++];
                   local -= first;
                   set.remove(first);
                }
            } 
            if (j - i + 1 < k) {  
                set.add(curr);
                j++;
            } else if (j - i + 1 == k) { 
                maxSum = Math.max(maxSum, local); 
                int first = nums[i]; 
                local -= first;
                set.remove(first);
                set.add(curr);
                j++;
                i++;
            }
        }

        return maxSum;
    }
}
