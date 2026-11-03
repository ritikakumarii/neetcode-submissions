class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap();
        // HashMap<Character,Integer> map2 = new HashMap();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!map1.containsKey(ch)) return false;
            map1.put(ch,map1.get(ch)-1);
        }
        for(char ch :map1.keySet()){
            if(map1.get(ch)!=0) return false;
        }

        return true;
    }
}
