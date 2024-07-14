class Solution {
    public int findDuplicate(int[] nums) {
       int i =0;
       while(i < nums.length){
        int corr = nums[i]-1;
        if(nums[corr] != nums[i]){
           int temp = nums[i];
           nums[i] = nums[corr];
           nums[corr] = temp;
        }else{
            i++;
        }
       }
       return nums[nums.length-1];
    }
}
