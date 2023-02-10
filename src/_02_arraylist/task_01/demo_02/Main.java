package _02_arraylist.task_01.demo_02;


public class Main {

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        DataPrinter printer = new DataPrinter();
        printer.showTeamList(provider.getTeamList());
    }
}
