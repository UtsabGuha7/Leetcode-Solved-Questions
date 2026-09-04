class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] list= new List[s.length()+1];
        for(char c: map.keySet()){
            int cnt=map.get(c);
            if(list[cnt]==null){
                list[cnt]=new ArrayList<>();
            }
            list[cnt].add(c);
        }
        StringBuilder ans= new StringBuilder();
        for(int i=list.length-1;i>=1;i--){
            if(list[i]!=null){
                for(char ch:list[i]){
                    for(int j=0;j<i;j++){
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}