package _01_list.task_06;

import java.util.ArrayList;
import java.util.List;

public class List06A {

    static List<String> products;
    static String product;

    public static void main(String[] args) {
        getData();
        product = "Молоко";
        searchProduct(product);
    }

    private static void getData() {
        products = new ArrayList<>();
        products.add("Апельсин");
        products.add("Яблокр");
        products.add("Сыр");
        products.add("Молоко");
        products.add("Орехи");
    }

    private static void searchProduct(String product) {
        if (products.contains(product)) {
            System.out.printf("В перечне есть товар: %s", product);
        } else {
            System.out.printf("В перечне нет товара: %s", product);
        }
    }
}
