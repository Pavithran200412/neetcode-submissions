class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String c : strs){
            char[] arr = c.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);  

            mpp.putIfAbsent(key, new ArrayList<>());
            mpp.get(key).add(c);
        }
        return new ArrayList<>(mpp.values());
    }
}
