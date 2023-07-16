package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;
/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList(Arrays.asList("земля", "марс", "земля",
                                                                 "венера", "венера", "земля"));
        System.out.println(arr);
        int count = 0;
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            count = 0;
            if (!list1.contains(arr.get(i))) {
                list1.add(arr.get(i));
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(i) == arr.get(j)) {
                        count += 1;
                    }
                }
                System.out.printf("%s : %s %n", arr.get(i), count);
            
            }
        }
    }
}