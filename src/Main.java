import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    static public void main(String[] args)
    {
        task__Palindrome();
        task__MissingWord();
        task__Pangram();
    }

    private static void task__Palindrome()
    {
        System.out.println("TASK: palindromes");

        int numPalindromes = 0;

        String sentence = read("Enter some words: ");

        if (!sentence.isEmpty())
        {
            String[] words = sentence.split("\\s+");

            for (String word : words)
            {
                if (!(PalindromeTester.isPalindrome(word))) continue;
                System.out.println("\t" + word);
                numPalindromes++;
            }
        }

        System.out.printf("# of palindromes: %d\n\n", numPalindromes);
    }

    private static void task__MissingWord()
    {
        System.out.println("TASK: missing word");

        String s = read("Enter sentence: ");
        String t = read("Enter word: ");

        String[] words = MissingWords.excludeWord(s, t);

        for (String word : words)
        {
            System.out.println("'" + word + "'");
        }

        System.out.println("\n");
    }

    private static void task__Pangram()
    {
        System.out.println("TASK: pangram sentence");

        String sentence = read("Enter sentence: ");

        sentence = sentence.replaceAll("\\s+", "").toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++)
        {
            letters.add(sentence.charAt(i));
        }

        System.out.println(PangramTester.isPangram(letters) ? "pangram" : "not pangram");

    }


    private static String read(String message)
    {
        System.out.print(message);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            return br.readLine().trim();
        } catch (IOException err)
        {
            System.err.println("ERROR: " + err + "\n");
            return "";
        }
    }
}
