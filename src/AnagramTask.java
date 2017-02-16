import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anny on 16.02.17.
 */
public class AnagramTask
{

    public static int numberNeeded(String first, String second) {

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();


        for (char c1 : first.toCharArray()) {
            list1.add(c1);
        }
        for (char c2 : second.toCharArray()) {
            list2.add(c2);
        }

        Iterator<Character> iter = list1.iterator();
        while (iter.hasNext()) {
            Character item = iter.next();
            if (list2.contains(item)) {
                list2.remove(item);
                iter.remove();
            }
        }

        return list1.size() + list2.size();

    }
}
