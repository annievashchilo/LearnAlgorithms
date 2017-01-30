public class PalindromeTester
{
    public static boolean isPalindrome(String word)
    {
        StringBuilder br = new StringBuilder(word);
        String reversedWord = br.reverse().toString();

        return (word.equals(reversedWord));
    }
}
