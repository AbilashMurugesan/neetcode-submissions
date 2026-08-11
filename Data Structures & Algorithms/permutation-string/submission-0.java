class Solution {
    public boolean checkInclusion(String A, String B) {
        int[]AMap=new int[26];
        int[]BMap=new int[26];
        int n=A.length();
        int m=B.length();
        if(n>m){
            return false;
        }

        for(char c:A.toCharArray()){
            AMap[c-'a']++;
        }

        for(int i=0;i<n;i++){
            char c=B.charAt(i);
            BMap[c-'a']++;
        }
        if(Arrays.equals(AMap,BMap)){
            return true;
        }
        int l=0;
        int r=n;
        for(;r<m;r++){
            char c=B.charAt(l++);
            BMap[c-'a']--;

            c=B.charAt(r);
            BMap[c-'a']++;
            if(Arrays.equals(AMap,BMap)){
                return true;
            }
        }
        return false;



        // for(char c:s1.toCharArray()){
        //     if(!map.containsKey(c)){
        //         return false;
        //     }else{
        //         int a=map.get(c);
        //         if(a==1){
        //             map.remove(c);
        //         }else{
        //             map.put(c,a-1);
        //         }
        //     }
        // }
        // return true;
    }
}
