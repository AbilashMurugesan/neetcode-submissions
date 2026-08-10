class Solution {
	public String encode(List<String> A) {
		if(A==null) {

			return new String();
		}
		StringBuilder sb=new StringBuilder();
		int n=A.size();
		for(int i=0;i<n;i++) {
			// System.out.println(A.get(i)+" "+A.get(i).length());
			sb.append(A.get(i).length());
			sb.append(",");
		}
		sb.append("!");
		for(String s:A) {
			System.out.println(s);
			sb.append(s);
		}
		return sb.toString();
    }

    public List<String> decode(String A) {
    	if(A.length()==0) {
    		return null;
    	}
    	int i=0;
    	List<Integer> sizes=new ArrayList<>();
    	List<String> res=new ArrayList<>();
    	while(A.charAt(i)!='!') {
    		StringBuilder sb=new StringBuilder();
    		while(A.charAt(i)!=',') {
    			sb.append(A.charAt(i));
        		i++;
    		}
    		sizes.add(Integer.parseInt(sb.toString()));
    		i++;
    	}
    	i++;
    	for(int a:sizes) {
    		res.add(A.substring(i,i+a));
    		i+=a;
    	}
    	return res;
    }
}
