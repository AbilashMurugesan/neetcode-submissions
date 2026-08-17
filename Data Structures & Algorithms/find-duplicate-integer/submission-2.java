class Solution {
    public int findDuplicate(int[] A) {
        int slow=0;
        int fast=0;
        do{
            slow=A[slow];
            fast=A[A[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){
            slow=A[slow];
            fast=A[fast];
        }
        return slow;
    }
}
