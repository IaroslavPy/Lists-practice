package _02_arraylist.task_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> list;

    public static void main(String[] args) {
        getList();
        showResult(doInput());
    }

    private static void getList() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество товаров: ");
        int num = sc.nextInt();

        System.out.println("Введите товары: ");
        list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            list.add(sc.next());
        }
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
