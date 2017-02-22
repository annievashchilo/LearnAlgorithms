import calculator.Calculator;
import calculator.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main
{
    static public void main(String[] args)
    {
//        task__Palindrome();
//        task__MissingWord();
//        task__Pangram();
//        task__Anagram();
//        task__FirstRepeatedWord();
        task__Calculator();
        task__SuperReducedString();
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

        String[] words = MissingWords.missingWords(s, t);

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

    private static void task__Anagram()
    {
        System.out.println("TASK: making anagrams");

        String first = read("Enter the first string: ");
        String second = read("Enter the second string: ");

        System.out.println("Number of characters to delete: " +
                AnagramTask.numberNeeded(first, second));
    }

    private static void task__FirstRepeatedWord()
    {
        System.out.println("TASK: find the first repeated word");

        String sentence = read("Enter the sentence: ");

        System.out.println("The first repeated word: " + RepeatedWord.findRepeatedWord(sentence));


    }

    private static void task__Calculator()
    {
        System.out.println("TASK: calculate the simplest equation");

//        String s = read("Enter the equation: ");

        String s = "1 +2 + 3 + 4 -5 + 6";

        System.out.println("Result = " + Calculator.calculate(Parser.parse(s)));
    }

    private static void task__SuperReducedString()
    {
        System.out.println("TASK: reduce String s as much as possible");

        String s = read("Enter string: ");

        System.out.println(SuperReducedString.reduceString(s).length() != 0 ? s : "Empty String");
    }


    private static void task__CaesarCipher()
    {
        System.out.println("TASK: Caesar Cipher");

        String length = read("Enter string length: ");
        String msg = read("Enter message to encrypt: ");
        String shift = read("Enter shift: ");

        System.out.println(CaesarCipher.encrypt(msg, Integer.parseInt(length), Integer.parseInt(shift)));


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
