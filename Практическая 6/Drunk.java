import java.util.ArrayDeque;
import java.util.Queue;

public class Drunk
{

    Queue<Integer> first, second;

    public Drunk(String first, String second)
    {
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for (int i = 0; i < 5; i++)
        {
            this.first.add(Integer.parseInt(first.substring(i, i + 1)));
            this.second.add(Integer.parseInt(second.substring(i, i + 1)));
        }
    }

    public String game()
    {
        int count_steps = 0;
        String result = "";
        while (!first.isEmpty() && !second.isEmpty() && count_steps < 106)
        {
            if (second.peek() != 0 && first.peek() > second.peek())
            {
                first.add(first.remove());
                first.add(second.remove());
            }
            else
            {
                second.add(first.remove());
                second.add(second.remove());
            }
            count_steps = count_steps + 1;
        }
        if (first.isEmpty())
            result = result + "second ";
        else
            if (second.isEmpty())
                result += "first ";
        result = result + count_steps;
        if (count_steps >= 106)
            result = result + " botva";
        return result;
    }

    public static void main(String[] args)
    {

        System.out.println(new Drunk("13579", "24680").game());

    }

}