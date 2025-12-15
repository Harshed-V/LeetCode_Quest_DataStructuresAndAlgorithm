import java.util.*;

class Solution {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int num:nums){
            set.add(num);
        }
        for(int i=1 ;i<=n;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}
