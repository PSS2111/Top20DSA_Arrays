import java.util.HashMap;

public class TwoSum {

     static int [] solution(int[] nums, int target) {
        HashMap <Integer, Integer> hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr=target-nums[i];
            if(hm.containsKey(curr)){
                return new int[] {hm.get(curr),i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        solution(nums,target);
    }

    
}
