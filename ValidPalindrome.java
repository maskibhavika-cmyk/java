class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

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
            else {
                char a = Character.toLowerCase(s.charAt(left));
                char b = Character.toLowerCase(s.charAt(right));

                if (a != b) {
                    isPalindrome = false;
                    break;
                }

                left++;
                right--;
            }
        }

        System.out.println(isPalindrome);
    }
}