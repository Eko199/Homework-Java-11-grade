package RealHomework2.Test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestSchoolMember {
    public static void main(String[] args) {
        LinkedList<SchoolMember> list = new LinkedList<>();
        list.add(new Teacher("1", "1@gmail.com", 20, new String[] {"1", "2", "3"}));
        list.add(new Administrator("2", "2@gmail.com", 50, new String[] {"1", "2", "3", "2", "3"}));
        list.add(new Teacher("3", "3@gmail.com", 200, new String[] {"1", "3"}));
        list.add(new Teacher("4", "4@gmail.com", 69, new String[] { "3", "2", "3"}));
        list.add(new Administrator("5", "5@gmail.com", 0));

        Iterator<SchoolMember> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
