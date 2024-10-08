import java.util.*;

public class SearchingNamesLinearSearch {
    static int indexOfItem(List<String> list, String target) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        // We have to return an integer, so return an "impossible"
        // index to indicate value was not found.
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba", "Elida Sleight"));
        System.out.println(indexOfItem(list, "Lucie Hansman"));
    }
}