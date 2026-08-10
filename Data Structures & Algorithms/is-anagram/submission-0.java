class Solution {
    public boolean isAnagram(String s, String t) {
         int[] map=new int[26];

        for(char c: s.toCharArray()){
            int idx=Character.toLowerCase(c)-'a';
            map[idx]++;
        }
        for(char c: t.toCharArray()){
            int idx=Character.toLowerCase(c)-'a';
            map[idx]--;
        }
        for(int idx:map){
            if(idx!=0)
                return false;
        }
        return true;
    }
}
