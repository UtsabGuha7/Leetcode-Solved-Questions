class Solution {
    public boolean rotateString(String s, String goal) {
       StringBuilder demo = new StringBuilder();
        if(s.length()!=goal.length()){
            return false;
        }
       for(int i=0;i<s.length();i++){
        String join= s.substring(i)+s.substring(0,i);
        if(join.equals(goal)){
            return true;
        }
       } 
       return false;
    }
}