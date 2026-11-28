

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean isAnagram = true;

        if (s.length() != t.length()) {
            isAnagram = false;
        }

        else {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {

                count[s.charAt(i) - 'a']++;

                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {

                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println(isAnagram);
    }
}
