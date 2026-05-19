class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> occurence = new HashSet<>();
     for(int n : nums){
             if(!occurence.contains(n)){
              occurence.add(n);
             } else{
                return true;
             }
     }
        return false;
        
    }
}