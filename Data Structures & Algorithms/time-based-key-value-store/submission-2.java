class TimeMap {

    Map<String,List<MyPair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int ts) {
        map.putIfAbsent(key,new ArrayList<MyPair>());
        map.get(key).add(new MyPair(value,ts));
    }
    
    public String get(String key, int ts) {
        List<MyPair> list=map.get(key);
        int s=0;
        if(list==null){
            return "";
        }
        int n=list.size();
        int e=n-1;
        int max=-1;
        String res=new String();
        while(s<=e){
            int m=(e-s)/2+s;
            MyPair pair=list.get(m);
            if(pair.ts==ts){
                return pair.value;
            }else if(pair.ts>ts){
                e=m-1;
            }else{
                if(pair.ts>max){
                    max=pair.ts;
                    res=pair.value;
                }
                s=m+1;
            }
        }
        return res;
    }
}
class MyPair{
    String value;
    int ts;
    public MyPair(String value,int ts){
        this.value=value;
        this.ts=ts;
    }
}
