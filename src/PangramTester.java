import java.util.Set;

/**
 * Created by Anny on 30.01.17.
 */
public class PangramTester
{
    public static final int alphabet_size = 26;


    public static boolean isPangram(Set<Character> letters)
    {
        return letters.size() == alphabet_size;
    }
}
