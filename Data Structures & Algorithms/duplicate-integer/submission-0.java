class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            int ch = nums[i];
            if(set.contains(ch)){
                return true;
            }
            else{
                set.add(ch);
            }
        }
        return false;
    }
}