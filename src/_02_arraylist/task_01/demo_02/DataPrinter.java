package _02_arraylist.task_01.demo_02;

import java.util.ArrayList;

public class DataPrinter {

    public void showTeamList(ArrayList<Member> list) {
        int count = 0;
        for (Member member : list) {
            count++;
            System.out.println(count + ". " + member.name
                    + " " + member.phone);
        }
    }
}
