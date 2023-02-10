package _01_list.task_01;

import java.util.ArrayList;
import java.util.List;

public class List06 {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Апельсин");
        products.add("Яблокр");
        products.add("Сыр");
        products.add("Молоко");
        products.add("Орехи");

        String product = "Молоко";

        if (products.contains(product)) {
            System.out.printf("В перечне есть товар: %s", product);
        } else {
            System.out.printf("В перечне нет товара: %s", product);
        }
    }
}
