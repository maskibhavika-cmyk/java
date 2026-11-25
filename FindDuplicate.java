
public class FindDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int duplicate = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    duplicate = nums[i];
                    break;
                }
            }

            if (duplicate != -1) {
                break;
            }
        }

        System.out.println(duplicate);
    }
}
