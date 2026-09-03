class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder sentence = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
                if(i<0){
                    break;
                }
                int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String word=s.substring(i+1,end+1);
        if(sentence.length()>0){
        sentence.append(' ');

        }
        sentence.append(word);
    }
        return sentence.toString();
    }
    }