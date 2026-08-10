class Solution {
    public boolean isPalindrome(String A) {
        int n=A.length();
        int l=0;
        int r=n-1;

        while(l<=r){
            if(!Character.isLetterOrDigit(A.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(A.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(A.charAt(r)) != Character.toLowerCase(A.charAt(l))){
                return false;
            }
            l++;r--;
        }
        return true;
    }
}
