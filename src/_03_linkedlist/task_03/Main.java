package _03_linkedlist.task_03;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static LinkedList<String> list;

    public static void main(String[] args) {
        getList();
        showResult(doInput());
    }

    private static void getList() {
        list = new LinkedList<>();
        list.add("Роза");
        list.add("Гладиолус");
        list.add("Астра");
        list.add("Тюльпан");
        list.add("Фиалка");
    }

    private static String doInput() {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите поиск: ");
        input = scanner.nextLine().trim();
        scanner.close();
        return input;
    }

    private static void showResult(String element) {

        boolean hasContain = list.contains(element);

        if (hasContain)
            System.out.println("Список содержит " + element);
        else
            System.out.println("Список не содержит " + element);
    }
}
