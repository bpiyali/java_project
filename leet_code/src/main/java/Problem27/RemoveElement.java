package Problem27;
// created by: bandypiy
// Date: 10/15/2018

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int newLen =0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] != val){
                nums[newLen] = nums[i];
                newLen++;
            }
        }
        return newLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = removeElement(nums, val);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
