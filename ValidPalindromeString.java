
    

public class ValidPalindromeString {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            else if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }

            else {
                left++;
                right--;
            }
        }

        System.out.println(isPalindrome);
    }
}

