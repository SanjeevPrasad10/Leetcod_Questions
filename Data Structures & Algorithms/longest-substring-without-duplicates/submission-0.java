class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int maxLen = 0;

        while(windowEnd<n){
            char ch = s.charAt(windowEnd);
            if(set.contains(ch)){
                while(windowStart<windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            maxLen = Math.max(maxLen, windowEnd-windowStart+1);
            windowEnd++;
        }
        return maxLen;
    }   
}