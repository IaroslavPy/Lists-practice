package _01_list.task_06.homeWork.task1_3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        output(getData());
        output(handleData(getData()));
    }

    private static List<String> getData(){
        List<String> list = new ArrayList<>();
        list.add("Алина");
        list.add("Виктор");
        list.add("Яна");
        list.add("Дмитрий");
        list.add("Владимир");
        list.add("Борис");
        list.add("Ольга");
        return list;
    }

    private static List<String> handleData(List<String> handleList) {
        Collections.sort(handleList);
        return handleList;
    }

    private static void output(List<String> outputList){
        System.out.println("\n Output list:  \n");
        int counter = 1;
        for (String name: outputList) {
            System.out.println(counter + ". " + name + ".");
            counter++;
        }
    }
}
