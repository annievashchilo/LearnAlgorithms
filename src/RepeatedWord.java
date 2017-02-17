import java.util.*;

public class RepeatedWord
{

    public static String findRepeatedWord(String sentence)
    {
        if (sentence.isEmpty()) return "";

        String[] words = sentence.split("\\s+");

        Set<String> tmp_set = new HashSet<>();

        String repeatedWord = "";

        for (String word : words)
        {
            if (!tmp_set.add(word))
            {
                repeatedWord = word;
                return repeatedWord;
            }
        }
        return repeatedWord;

    }
}