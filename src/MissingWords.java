public class MissingWords
{
    public static String[] excludeWord(String sentence, String word)
    {

        if (sentence.isEmpty())
        {
            return new String[0];
        }

        for (String s : word.split("\\s+"))
        {

            if (!s.isEmpty())
            {
                sentence = sentence.replaceFirst(s, "");
            }
        }

        return sentence.split("\\s+");
    }
}
