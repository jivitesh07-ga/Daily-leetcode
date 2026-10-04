class Solution {
    public boolean checkValidString(String s) {
        if(s.length()==0){
            return false;
        }
        int maxOpen=0;
        int minOpen=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                maxOpen++;
                minOpen++;
            }else if(ch==')'){
                maxOpen--;
                minOpen=Math.max(0,minOpen-1);
            }else{
                maxOpen++;
                minOpen=Math.max(0,minOpen-1);
            }
            if(maxOpen<0){
                return false;
            }
        }
        return minOpen==0;
    }
}