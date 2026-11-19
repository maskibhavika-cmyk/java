
import java.util.Arrays;

class FindOriginalArray {
    public static void main(String[] args) {

        int[] changed = {1, 3, 4, 2, 6, 8};

        if (changed.length % 2 != 0) {
            System.out.println("Invalid Array");
            return;
        }

        Arrays.sort(changed);

        int[] freq = new int[200001];

        for (int x : changed) {
            freq[x]++;
        }

        int[] ans = new int[changed.length / 2];
        int index = 0;

        for (int x : changed) {

            if (freq[x] == 0) {
                continue;
            }

            if (x == 0) {
                if (freq[0] < 2) {
                    System.out.println("Invalid Array");
                    return;
                }

                freq[0] -= 2;
                ans[index] = 0;
                index++;
            }

            else {
                if (freq[2 * x] == 0) {
                    System.out.println("Invalid Array");
                    return;
                }

                freq[x]--;
                freq[2 * x]--;

                ans[index] = x;
                index++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
