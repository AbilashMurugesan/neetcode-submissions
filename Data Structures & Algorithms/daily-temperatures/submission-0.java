class Solution {
    public int[] dailyTemperatures(int[] A) {
        int n=A.length;
        Stack<MyPair> stack=new Stack<>();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int a=A[i];
            while(!stack.isEmpty() && stack.peek().a<a){
                MyPair pair=stack.pop();
                res[pair.i]=i-pair.i;
            }
            stack.push(new MyPair(a,i));
        }
        return res;
    }
}
class MyPair{
    int a;
    int i;
    public MyPair(int a,int i){
        this.a=a;
        this.i=i;
    }
}
