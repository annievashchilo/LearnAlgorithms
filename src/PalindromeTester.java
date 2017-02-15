public class PalindromeTester
{
//    public static boolean isPalindrome(String word)
//    {
//        return word.equals(new StringBuilder(word).reverse().toString());
//    }


    public static boolean isPalindrome(String word)
    {
        boolean result = true;
        for ( int i = 0; i < word.length() / 2 ; i++)
        {
            if (word.charAt(i) == word.charAt(word.length() - i - 1) )
            {
                result = true;
                continue;
            }
            else return false;

        }
        return result;
    }
}
