class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n = temp.length;
        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            while(!st.empty() && temp[i] > temp[st.peek()]){
                int prevIndex = st.pop();
                ans[prevIndex] = i-prevIndex;
            }
            st.push(i);
        }
        return ans;
    }
}