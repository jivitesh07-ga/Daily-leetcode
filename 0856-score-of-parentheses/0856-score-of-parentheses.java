class Solution {
    public int scoreOfParentheses(String s) {
        if(s.length()==0){
            return 0;
        }
        int score=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }else if(s.charAt(i)==')'){
                depth--;
                if(s.charAt(i-1)=='(')
                score+=(1<<depth);
            }
        }
        return score;
    }
}