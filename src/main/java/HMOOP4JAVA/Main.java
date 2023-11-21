package HMOOP4JAVA;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        TeacherSevice name = new TeacherSevice();
        name.TV("Наталья",25,"Женщина",2);


        TeacherSevice name2 = new TeacherSevice();
        name2.TV("Максим",27,"Мужчина",3);
        System.out.println(name2);

        name.TV("defde",20,"fsdf",232);

        name.get();
        TeacherSevice name3 = new TeacherSevice();
        name3.get();

        GroupOfTeatcher list = new GroupOfTeatcher();

        list.add(name);
        list.add(name2);

        System.out.println(list);
        System.out.println();

        list.nextTeacher("Максим");


        list.redactor("Максим","Мурмур",20,"женщина",30); //Меняет по имени
    }
}
