package _02_arraylist.task_01.demo_02;

import java.util.ArrayList;

public class DataProvider {

    public ArrayList<Member> getTeamList() {

        Member member;
        ArrayList<Member> list;
        String name;
        String phone;

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

        return list;
    }
}
