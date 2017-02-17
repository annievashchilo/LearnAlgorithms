package calculator;


public class Calculator
{
    public static int calculate(String[] operands)
    {
        int result = 0;

        String action = "";

        for (String op : operands)
        {
            if (op.equals("+") || op.equals("-"))
            {
                action = op;
            } else if (op.matches("\\d+"))
            {
                switch (action)
                {
                    case "":
                    {
                        result = Integer.valueOf(op);
                        break;
                    }
                    case "+":
                    {
                        result += Integer.valueOf(op);
                        break;
                    }
                    case "-":
                    {
                        result -= Integer.valueOf(op);
                        break;
                    }
                }

                action = "";
            }
        }

        return result;
    }
}
