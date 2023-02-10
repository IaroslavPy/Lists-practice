package _01_list.task_06.homeWork.tast1_6;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        output(getData());
        checkData(getData());

    }

    private static List<String> getData() {
        List<String> products = new LinkedList<>();
        products.add("Butter");
        products.add("Juice");
        products.add("Meat");
        products.add("Fish");
        products.add("Sugar");
        return products;
    }

    //   private static void checkData(List<String> dataList){
//       String checkingProduct = "Mea";
//       int counter = 0;
//       for (String product: dataList){
//           if (product.equals(checkingProduct)){
//               counter++;
//           }
//       }
//       if (counter != 0){
//           System.out.println("\n" + checkingProduct + " found in the list!");
//       } else {
//           System.out.println("\n" + checkingProduct + " not found in the list!");
//       }
//   }
    private static void checkData(List<String> dataList) {
        String checkingProduct = "Meat";
        if (dataList.contains(checkingProduct)) {
            System.out.println("\n" + checkingProduct + " found in the list!");
        } else {
            System.out.println("\n" + checkingProduct + " not found in the list!");
        }

    }

    private static void output(List<String> outputList) {
        System.out.println("\n Output: \n");
        int counter = 1;
        for (String product : outputList) {
            System.out.println(counter + ". " + product + ".");
            counter++;
        }
    }
}
