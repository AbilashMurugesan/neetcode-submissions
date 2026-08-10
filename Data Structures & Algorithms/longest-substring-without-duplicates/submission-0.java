class Solution {
    public int lengthOfLongestSubstring(String A) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        int n=A.length();
        String s="abcabcbb";
        for(int r=0;r<n;r++){
            char c=A.charAt(r);
            while(l<n && set.contains(c) ){
                set.remove(A.charAt(l++));
            }
            set.add(c);
            max=Math.max(max,set.size());
        }
        return max;
    }
}
