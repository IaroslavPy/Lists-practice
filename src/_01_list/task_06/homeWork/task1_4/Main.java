package _01_list.task_06.homeWork.task1_4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        output(getDataFirst());
        output(getDataSecond());
        output(getDataThird(getDataFirst(), getDataSecond()));
    }

    private static List<String> getDataFirst(){
        List<String> products = new LinkedList<>();
        products.add("Butter");
        products.add("Juice");
        products.add("Meat");
        products.add("Fish");
        products.add("Sugar");
        return products;
    }
    private static List<String> getDataSecond(){
        List<String> products = new LinkedList<>();
        products.add("Milk");
        products.add("Cola");
        products.add("Milk");
        products.add("Juice");
        products.add("Meat");
        products.add("Fish");
        products.add("Sugar");
        return products;
    }
    private static List<String> getDataThird(List<String> firstList, List<String> secondList){
        firstList.addAll(secondList);
        return firstList;
    }
    private static void output(List<String> outputList){
        System.out.println("\n Output: \n");
        int counter = 1;
        for (String product: outputList) {
            System.out.println(counter + ". " + product + ".");
            counter++;
        }
    }
}
