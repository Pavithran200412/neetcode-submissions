class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
        for(int min : mpp.keySet()){
            if(mpp.get(min) == 1){
                return min;
            }
        }
        return -1;
    }
}
