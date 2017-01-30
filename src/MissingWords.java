public class MissingWords
{
    public static String[] excludeWord(String sentence, String word)
    {
        if (sentence.isEmpty())
        {
            return new String[0];
        }

        if (!word.isEmpty())
        {
            sentence = sentence.replaceAll(word, " ");
        }

        return sentence.split("\\s+");
    }
}
