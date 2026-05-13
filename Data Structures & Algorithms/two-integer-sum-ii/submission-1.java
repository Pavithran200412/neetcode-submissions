class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int num = numbers[i] + numbers[j];
                if(num == target){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}
