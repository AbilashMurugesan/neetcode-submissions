class Solution {
    public int[] twoSum(int[] A, int t) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<A.length;i++){
            int a=A[i];
            if(map.containsKey(t-a)){
                return new int[]{map.get(t-a),i};
            }
            map.put(a,i);
        }
        return new int[]{-1,-1};
    }
}
