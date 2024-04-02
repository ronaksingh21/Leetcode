class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = nums[i-1]*left[i-1];
        }
        int right =1;
        int num =0;
        for(int j=nums.length -1; j>=0;j--){
            num = nums[j];
             nums[j] = left[j] * right;
            right = num * right;
        }
        return nums;
    }
}