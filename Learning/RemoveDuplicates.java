public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int i=0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(i);
        for (int j = 0; j <i+1; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
