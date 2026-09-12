class Solution {
    public boolean isPalindrome(String s) {
       
       String  sb=s;
        int left=0;
        int right=sb.length()-1;
        while(left<=right){
            while(left<right && !Character.isLetterOrDigit(sb.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(sb.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(sb.charAt(left))!=Character.toLowerCase(sb.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
