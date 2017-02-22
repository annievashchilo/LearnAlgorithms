import java.util.ArrayList;
import java.util.Scanner;

public class TwoChars
{

    public int findLengthOfTwoCharacters(String str, int n, char ch1, char ch2)
    {
        int i, count = 0;
        for (i = 0; i < n; i++)
        {
            if (count % 2 == 0)
            {
                if (str.charAt(i) == ch2)
                    return 0;
                else if (str.charAt(i) == ch1)
                    count++;
            } else
            {
                if (str.charAt(i) == ch1)
                    return 0;
                else if (str.charAt(i) == ch2)
                    count++;
            }
        }
        return count;
    }

    public void solve()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, max = 0, n = sc.nextInt(), len;
        String str = sc.next();
        boolean ch[] = new boolean[26]; //checks whether the character was found or not
        ArrayList<Character> distinctCharacters = new ArrayList<Character>();
        //maintains a list of distinct characters
        for (i = 0; i < n; i++)
        {
            int val = str.charAt(i) - 97;
            if (!ch[val])
            {
                ch[val] = true;
                distinctCharacters.add(str.charAt(i));
            }
        }
        //solve now
        len = distinctCharacters.size();
        for (i = 0; i < len; i++)
        {
            for (j = 0; j < len; j++)
            {
                if (i != j)
                {
                    int temp = findLengthOfTwoCharacters(str, n, distinctCharacters.get(i), distinctCharacters.get(j));
                    if (temp > max)
                        max = temp;
                }
            }
        }
        System.out.print(max);

    }
}
