class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> shash=new HashMap<>();
        HashMap<Character,Integer> thash=new HashMap<>();
        for(Character sh:s.toCharArray()){
            if(shash.containsKey(sh)){
                shash.put(sh,shash.get(sh)+1);
            }else{
            shash.put(sh,1);}
        }
         for(Character th:t.toCharArray()){
            if(thash.containsKey(th)){
                thash.put(th,thash.get(th)+1);
            }else{
            thash.put(th,1);}
        }
        return shash.equals(thash);
    }
}
