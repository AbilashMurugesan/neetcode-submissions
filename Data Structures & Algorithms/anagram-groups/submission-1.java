class Solution {
    public List<List<String>> groupAnagrams(String[] A) {
       return  new ArrayList<>(Arrays.stream(A).collect(Collectors.groupingBy(a->{
            char[] ca=a.toCharArray();
            Arrays.sort(ca);
            return new String(ca);
        })).values());
    }
}
