class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] result = new int[2];
        for(int i =0;i < nums.length;i++){
            int x = target - nums[i];
            if (mp.containsKey(x)) {
                return new int[]{mp.get(x), i};
            }
            mp.put(nums[i], i);
        }
        return result;
    }
}
