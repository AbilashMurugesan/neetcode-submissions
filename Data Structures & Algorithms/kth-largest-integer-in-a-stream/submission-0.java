class KthLargest {
 PriorityQueue<Integer> pq;
    int cap;
    public KthLargest(int k, int[] A) {
        pq=new PriorityQueue<>();
        cap=k;
        for(int a:A){
            add(a);
        }
    }
    
    public int add(int a) {
        if(pq.size()<cap){
            pq.add(a);
        }else{
            if(pq.peek()<a){
                pq.poll();
                pq.add(a);
            }
        }
        return pq.peek();
    }
}
