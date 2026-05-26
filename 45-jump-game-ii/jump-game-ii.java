class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
         if (n <= 1)
            return 0;
        int currentPosition = 0;
        int jumps =0;
        int maxReachability =0;
        int maxReachabilityIndex =0;
        for(int i = 0; i<n; i++){
            if(currentPosition + nums[currentPosition] >= n-1)
            return jumps+1;

            if(i>currentPosition +nums[currentPosition]){
                currentPosition = maxReachabilityIndex;
                jumps++;
            }
            int reachability = i+nums[i];
            if(reachability > maxReachability){
                maxReachability = reachability;
                maxReachabilityIndex = i;
            }
        }

        return jumps+1;

    }
}