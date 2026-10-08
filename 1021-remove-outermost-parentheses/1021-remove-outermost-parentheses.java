class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length()==0){
            return "";
        }
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
             //   st.push(s.charAt(i));
            }
        }
        return sb.toString();
    }
}