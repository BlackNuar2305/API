package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class task2 {
    public static void main(String[] args) {
        List<Object> arr = new ArrayList<>(Arrays.asList("asf", "asfd", 2, 3, 4, 56));
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
                i--;
            }
        }
    }
}
