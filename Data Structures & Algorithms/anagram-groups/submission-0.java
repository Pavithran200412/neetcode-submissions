class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String c : strs){
            char[] arr = c.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);  

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(c);
        }
        return new ArrayList<>(mp.values());
    }
}
