class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
            str.append(Character.toLowerCase(c));
            }
        }
        int start = 0;
        int end = str.length() -1;

        Boolean isPalindrome = true;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
        return true;
        }
        return false;
    }
}
