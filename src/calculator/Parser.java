package calculator;

import java.util.List;
import java.util.Vector;

public class Parser
{
    public static String[] parse(String aText)
    {
        StringBuilder buffer = new StringBuilder();
        List<String> result = new Vector<>();

        for (char letter : aText.toCharArray())
        {
            if (letter == '+' || letter == '-')
            {
                result.add(buffer.toString());
                result.add(String.valueOf(letter));
                buffer.setLength(0);
            } else if (letter >= '0' && letter <= '9')
            {
                buffer.append(letter);
            }
        }

        result.add(buffer.toString());
        return result.toArray(new String[0]);
    }
}
