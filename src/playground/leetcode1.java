package playground;

public class leetcode1 {

	public static void main(String[] args) {
		int[] result = twoSum(new int[]{6,11,15,2,7}, 9);
		for(int i : result) {
			System.out.println(i);
		}

	}
	
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0}; 
    }
}
