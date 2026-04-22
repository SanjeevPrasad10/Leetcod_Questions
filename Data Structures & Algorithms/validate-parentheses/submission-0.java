

class Solution {
    public boolean isValid(String str) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }

                if((st.peek() == '(' && ch == ')') ||
                   (st.peek() == '[' && ch == ']') ||
                   (st.peek() == '{' && ch == '}')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }

        return st.size() == 0;
    }
}