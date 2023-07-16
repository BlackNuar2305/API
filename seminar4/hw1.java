package seminar4;

import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(123);
        linkedList.add(625);
        linkedList.add(12312);
        LinkedList<Integer> linklist = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            linklist.add(linkedList.get(i));
        }
        System.out.println(linkedList);
        System.out.println(linklist);
    }
}

