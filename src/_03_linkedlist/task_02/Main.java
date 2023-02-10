package _03_linkedlist.task_02;


import java.util.LinkedList;

public class Main {

    static Fruit fruit;
    static LinkedList<Fruit> list;
    static String name;
    static int quantity;

    public static void main(String[] args) {
        getFruitList();
        showFruitList();
    }

    private static void getFruitList() {

        list = new LinkedList<>();

        name = "Яблоко";
        quantity = 12;
        fruit = new Fruit(name, quantity);
        list.add(fruit);

        name = "Груша";
        quantity = 9;
        fruit = new Fruit(name, quantity);
        list.add(fruit);

        name = "Слива";
        quantity = 25;
        fruit = new Fruit(name, quantity);
        list.add(fruit);

        name = "Хурма";
        quantity = 7;
        fruit = new Fruit(name, quantity);
        list.add(fruit);
    }

    private static void showFruitList() {
        int count = 0;
        for (Fruit fruit: list) {
            count++;
            System.out.println(count + ". " + fruit.name
                    + " " + fruit.quantity + " шт.");
        }
    }
}
