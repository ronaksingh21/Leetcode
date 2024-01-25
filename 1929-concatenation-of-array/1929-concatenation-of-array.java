class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr= new int[nums.length*2];
        int i=0;
        for(int j=0;j<2;j++){
            for(int x:nums){
                arr[i]=x;
                 i++;
             }
        }
        
        return arr;
    }
}