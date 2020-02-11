package problem136;

public class problem136 {
    public int singleNumber(int[] nums) {
        int returnNo = nums[0];
        int len = nums.length;
        for(int i=1; i<len; i++){
            returnNo ^= nums[i];
        }
        return returnNo;
    }
}
