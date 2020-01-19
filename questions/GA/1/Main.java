import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Main {

    public static List<List<String>> groupAnagrams(List<String> words) {
        HashMap<String, List<String>> map = new HashMap<>();

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);

            if (map.containsKey(sortedStr)) {
                List<String> _list = map.get(sortedStr);
                _list.add(word);
            } else {
                List<String> _list = new ArrayList<>();
                _list.add(word);
                map.put(sortedStr, _list);
            }
        }

        List<List<String>> list = new ArrayList<>();
        Iterator<Entry<String, List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, List<String>> entry = it.next();
            list.add(entry.getValue());
        }
        return list;
    }

    public static void main(String[] args) {
        String[] list = new String[] { "yo", "act", "flop", "tac", "cat", "oy", "olfp" };
        List<List<String>> result = groupAnagrams(Arrays.asList(list));

        System.out.println(result);
    }
}