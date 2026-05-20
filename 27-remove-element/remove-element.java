class Solution {
    public int removeElement(int[] nums, int val) {
        int notval = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != val){
                nums[notval] = nums[i];
                notval++;
            }
        }
        return notval;
    }
}