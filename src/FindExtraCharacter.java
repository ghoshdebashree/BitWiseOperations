public class FindExtraCharacter {
    public static void main(String[] args) {
        // Example strings
        String str1 = "abcde";
        String str2 = "abedc";

        // Find the index of the extra character
        int result = findExtraCharacterIndex(str1, str2);

        // Print the result
        System.out.println("Index of the extra character: " + result);
    }

    public static int findExtraCharacterIndex(String str1, String str2) {
        // Get the lengths of the input strings
        int length1 = str1.length();
        int length2 = str2.length();

        // Find the minimum length among the two strings
        int minLength = Math.min(length1, length2);

        // Iterate through the characters of both strings
        for (int i = 0; i < minLength; i++) {
            // Compare characters at the same position
            if (str1.charAt(i) != str2.charAt(i)) {
                // If a mismatch is found, return the index of the character in the longer string
                return (length1 > length2) ? i : i;
            }
        }

        // If no mismatch is found in the common prefix, return the index of the extra character
        return (length1 > length2) ? minLength : minLength - 1;
    }

}
