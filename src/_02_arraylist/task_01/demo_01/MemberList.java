package _02_arraylist.task_01.demo_01;

import java.util.ArrayList;

public class MemberList {

    static Member member;
    static ArrayList<Member> list;
    static String name;
    static String phone;

    public static void main(String[] args) {
        getTeamList();
        showTeamList();
    }

    private static void getTeamList() {

        list = new ArrayList<>();

        name = "Алексей";
        phone = "055 123-2589";
        member = new Member(name, phone);
        list.add(member);

        name = "Вадим";
        phone = "099 123-4569";
        member = new Member(name, phone);
        list.add(member);

        name = "Семен";
        phone = "055 258-1234";
        member = new Member(name, phone);
        list.add(member);

        name = "Дмитрий";
        phone = "099 968-3657";
        member = new Member(name, phone);
        list.add(member);

        name = "Роман";
        phone = "055 879-3214";
        member = new Member(name, phone);
        list.add(member);
    }

    private static void showTeamList() {
        int count = 0;
        for (Member member : list) {
            count++;
            System.out.println(count + ". " + member.name
                    + " " + member.phone);
        }
    }
}
