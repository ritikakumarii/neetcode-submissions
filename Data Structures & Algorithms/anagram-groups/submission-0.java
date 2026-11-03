class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(str);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> list= new ArrayList<>();

       return new ArrayList<>(map.values()); 
    }
}
