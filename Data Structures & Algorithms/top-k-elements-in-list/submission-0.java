class Solution {
    public int[] topKFrequent(int[] A, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:A){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Comparator<MyPair> comp=(p1,p2)->Integer.compare(p2.freq,p1.freq);
        PriorityQueue<MyPair> pq=new PriorityQueue<>(comp);
        for(int key:map.keySet()){
            pq.add(new MyPair(key,map.get(key)));
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().key;
        }
        return res;
    }
}

class MyPair{
    int key;
    int freq;

    public MyPair(int key,int freq){
        this.key=key;
        this.freq=freq;
    }
}