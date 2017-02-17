import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords
{
    static String[] missingWords(String s, String t)
    {
        List<String> words_in_s = Arrays.asList(s.split("\\s+"));
        List<String> words_in_t = Arrays.asList(t.split("\\s+"));

        List<String> words_in_s_missing_from_t = new ArrayList<>();

        for (String word : words_in_s)
        {
            if (!words_in_t.contains(word))
            {
                words_in_s_missing_from_t.add(word);
            }
        }

        return words_in_s_missing_from_t.toArray(new String[0]);
    }

}
