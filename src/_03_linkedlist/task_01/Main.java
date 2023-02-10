package _03_linkedlist.task_01;

import java.util.LinkedList;

public class Main {

    static LinkedList<String> list;

    public static void main(String[] args) {
        getList();
        showResult();
        System.out.println("----------------------");
        removeByFirstOccurrence();
        showResult();
    }

    private static void getList() {
        list = new LinkedList<>();
        list.add("Роза");
        list.add("Гладиолус");
        list.add("Астра");
        list.add("Тюльпан");
        list.add("Гладиолус");
        list.add("Фиалка");
    }

    private static void removeByFirstOccurrence() {
        list.removeFirstOccurrence("Гладиолус");
    }

    private static void showResult() {
        int count = 0;
        for (String item : list) {
            count++;
            System.out.println(count + ". " + item);
        }
    }
}
