class Solution {

    private int[] nums;

    public void rotate(int[] nums, int k) {

        this.nums = nums;

        int n = nums.length;

        k = k % n;

        // Reverse complete array
        reverse(0, n - 1);

        // Reverse first k elements
        reverse(0, k - 1);

        // Reverse remaining elements
        reverse(k, n - 1);
    }

    private void reverse(int i, int j) {

        while(i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}