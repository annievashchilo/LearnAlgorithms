/**
 * Created by Anny on 22.02.17.
 */
public class SuperReducedString
{

    public static String reduceString(String word)
    {
        int j = word.length();
        for (int i = 0; i < j - 1; i++)
        {
            if (word.charAt(i) == word.charAt(i + 1))
            {
                word = word.substring(0, i) + word.substring(i + 2);
                i = -1;
                j = word.length();
            }
        }
        return word;

    }
}
