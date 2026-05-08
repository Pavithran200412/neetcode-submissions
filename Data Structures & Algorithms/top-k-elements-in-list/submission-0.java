class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int c : nums) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }
        // int max =(Collections.max(mpp.values()));
        // return new int[max];

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}
