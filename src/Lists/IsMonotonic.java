package Lists;

public class IsMonotonic {

    public static void main(String[] args){
        System.out.println(isMonotonic(new int[]{1, 2, 3, 4, 4, 5})); // true
        System.out.println(isMonotonic(new int[]{7, 6, 3})); // true
        System.out.println(isMonotonic(new int[]{8, 4, 6})); // false
    }

    public static boolean isMonotonic(int[] nums){
        return isDecreasing(nums) || isIncreasing(nums);
    }

    private static boolean isDecreasing(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1])
                return false;
        }
        return true;
    }

    private static boolean isIncreasing(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1])
                return false;
        }
        return true;
    }
}
