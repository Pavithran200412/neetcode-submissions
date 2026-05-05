class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            if(!mpp.containsKey(ch)){
                return false;
            }
            mpp.put(ch, mpp.get(ch) - 1);
            if(mpp.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
