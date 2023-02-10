package _01_list.task_01.homeWork.task1_2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        output(getData());
    }

    private static List<String> getData(){
        List<String> products = new LinkedList<>();
        products.add("Milk");
        products.add("Cola");
        products.add("Milk");
        products.add("Butter");
        products.add("Juice");
        products.add("Meat");
        products.add("Fish");
        products.add("Sugar");
        products.add(2, "Vodka");
        products.add(7,"Beer");
        products.remove(5);
        return products;
    }
    private static void output(List<String> outputList){
        System.out.println("First output:");
        int counter = 1;
        for (String product: outputList) {
            System.out.println(counter + ". " + product + ".");
            counter++;
        }
    }
}
