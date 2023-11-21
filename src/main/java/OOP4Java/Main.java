package OOP4Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args){

        ArrayList<User> list1 = new ArrayList<>();
        StudentGroup<User> group1 = new StudentGroup("Group1", list1);

        User student1 = new User("James","Bond","Viktorovich");
        User student2 = new User("John","Dow","Igorevich");
        User student3 = new User("George","Washington","Alexandrovich");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        UserComporator<User> userComporator = new UserComporator<>();
        for (User l: group1.getGroup()){
            System.out.println(l);
        }

        TreeSet<User> sortedGrop = new TreeSet<>(userComporator);

        for (User l: group1.getGroup()) {
            sortedGrop.add(l);
        }
        System.out.println(sortedGrop);
    }
}
