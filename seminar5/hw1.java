package seminar5;

import java.util.*;


public class hw1 {
    public static void main(String[] args) {
        Map<String, ArrayList> map = new HashMap<>();
        while (true) {
            AddingData(map);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добавить новое имя? 1 - да, 0 - нет");
            String string = scanner.nextLine();
            if (string.equals("1")) continue;
            else break;
        }
        sort(map);
    }
    public static Map<String, ArrayList> AddingData (Map<String, ArrayList> map) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите Имя: ");
        String str = scanner.nextLine();
        while (true) {
            System.out.println("Введите номер: ");
            int number = Integer.parseInt(scanner.nextLine());
            arrayList.add(number);
            map.put(str, arrayList);
            System.out.println("Добавить еще один номер? 1 - да, 0 - нет");
            String str1 = scanner.nextLine();
            if (str1.equals("1")) continue;
            else if (str1.equals("0")) break;
            else {
                System.out.println("Введена неправильная команда");
                break;
            }
        }
        return map;
    }

    public static void sort(Map<String, ArrayList> map) {
        int min = 10000000;
        int max = 0;
        for (var item : map.entrySet()) {
            if (max < item.getValue().size())
                max = item.getValue().size();
            if (min > item.getValue().size())
                min = item.getValue().size();
        }
        int n = max;
        while (n >= min) {
            for (var item : map.entrySet()) {
                if (n == item.getValue().size())
                    System.out.println(item.getKey() + " " + item.getValue());
            }
            n--;
        }
    }
}
