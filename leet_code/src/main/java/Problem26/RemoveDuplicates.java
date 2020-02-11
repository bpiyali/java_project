package Problem26;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int newLen =0;
        int len = nums.length -1;
        for(int i=0; i<len; i++){
            if(nums[i] != nums[i+1])
                nums[++newLen] = nums[i+1];
        }
        return ++newLen;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
