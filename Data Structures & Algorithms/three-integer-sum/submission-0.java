class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(A);
        int n=A.length;
        for(int i=0;i<n;i++){
            if(i>0 && A[i]==A[i-1]){
                continue;
            }else{
                int l=i+1;
                int r=n-1;
                while(l<r){
                    int a=A[i];
                    int s=a+A[l]+A[r];
                    if(s==0){
                        List<Integer> ans=new ArrayList<>();
                        ans.add(a);
                        ans.add(A[l]);
                        ans.add(A[r]);

                        res.add(new ArrayList<>(ans));

                        int il=A[l];
                        int ir=A[r];
                        while(l<n && A[l]==il){
                            l++;
                        }
                        while(r>=0 && A[r]==ir){
                            r--;
                        }
                    }else if(s>0){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }
        return res;
    }
}