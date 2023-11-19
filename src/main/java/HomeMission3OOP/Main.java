package HomeMission3OOP;

import java.util.ArrayList;
import java.util.List;

//        — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//        — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//        — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
public class Main {
    public static void main(String[] args) {
            Student man = new Student("Иван");
            Student man2 = new Student("Рома");
            Student man3 = new Student("Сергей");
            Student man4 = new Student("Андрей");

        StudentGroup studentGroup = new StudentGroup(man);
        studentGroup.setName("Технари");
        studentGroup.addStudentList(man2);
        studentGroup.addStudentList(man3);
        studentGroup.addStudentList(man4);

            Student girl = new Student("Настя");
            Student girl2 = new Student("Даша");
            Student girl3 = new Student("Алиса");
            Student girl4 = new Student("Полина");
            Student girl5 = new Student("Лера");

        StudentGroup studentGroup2 = new StudentGroup(girl);
        studentGroup2.setName("Дизайнеры");
        studentGroup2.addStudentList(girl2);
        studentGroup2.addStudentList(girl3);
        studentGroup2.addStudentList(girl4);
        studentGroup2.addStudentList(girl5);

            Student man22 = new Student("Рома");
            Student man23 = new Student("Сергей");
            Student man24 = new Student("Андрей");

        StudentGroup studentGroup3 = new StudentGroup(man);
        studentGroup3.setName("Программисты");
        studentGroup3.addStudentList(man22);
        studentGroup3.addStudentList(man23);
        studentGroup3.addStudentList(man24);

            Student girl1 = new Student("Настя");
            Student girl12 = new Student("Даша");
            Student girl13 = new Student("Алиса");
            Student girl14 = new Student("Полина");
            Student girl15 = new Student("Лера");
            Student girl16 = new Student("Валерия");

        StudentGroup studentGroup4 = new StudentGroup(girl);
        studentGroup4.setName("Художественная");
        studentGroup4.addStudentList(girl1);
        studentGroup4.addStudentList(girl2);
        studentGroup4.addStudentList(girl13);
        studentGroup4.addStudentList(girl14);
        studentGroup4.addStudentList(girl15);


            Student girl21 = new Student("Настя");
            Student girl22 = new Student("Даша");
            Student girl23 = new Student("Алиса");
            Student girl24 = new Student("Полина");
            Student girl25 = new Student("Лера");
            Student girl26 = new Student("Валерия");

        StudentGroup studentGroup5 = new StudentGroup(girl26);
        studentGroup5.setName("Экономисты1");
        studentGroup5.addStudentList(girl21);
        studentGroup5.addStudentList(girl22);
        studentGroup5.addStudentList(girl23);
        studentGroup5.addStudentList(girl24);
        studentGroup5.addStudentList(girl25);

        Student man31 = new Student("Иван");
        Student man32 = new Student("Рома");
        Student man33 = new Student("Сергей");

        StudentGroup studentGroup6 = new StudentGroup(man31);
        studentGroup6.setName("Технари");
        studentGroup6.addStudentList(man31);
        studentGroup6.addStudentList(man32);
        studentGroup6.addStudentList(man33);
        System.out.println(studentGroup);
        System.out.println(studentGroup.getStudentGroup());
        System.out.println();

        Student girl31 = new Student("Настя");
        Student girl32 = new Student("Даша");
        Student girl33 = new Student("Алиса");
        Student girl34 = new Student("Полина");
        Student girl35 = new Student("Лера");

        StudentGroup studentGroup7 = new StudentGroup(girl31);
        studentGroup7.setName("Дизайнеры");
        studentGroup7.addStudentList(girl32);
        studentGroup7.addStudentList(girl33);
        studentGroup7.addStudentList(girl34);
        studentGroup7.addStudentList(girl35);

        Student m1an22 = new Student("Рома");
        Student m1an23 = new Student("Сергей");
        Student m1an24 = new Student("Андрей");

        StudentGroup studentGroup8 = new StudentGroup(man);
        studentGroup8.setName("Программисты");
        studentGroup8.addStudentList(m1an22);
        studentGroup8.addStudentList(m1an23);
        studentGroup8.addStudentList(m1an24);

        Student g1irl1 = new Student("Настя");
        Student g1irl12 = new Student("Даша");
        Student g1irl13 = new Student("Алиса");
        Student g1irl14 = new Student("Полина");
        Student g1irl15 = new Student("Лера");
        Student g1irl16 = new Student("Валерия");

        StudentGroup studentGroup9 = new StudentGroup(g1irl16);
        studentGroup9.setName("Художественная");
        studentGroup9.addStudentList(g1irl1);
        studentGroup9.addStudentList(g1irl12);
        studentGroup9.addStudentList(g1irl13);
        studentGroup9.addStudentList(g1irl14);
        studentGroup9.addStudentList(g1irl15);


        Student g2irl21 = new Student("Настя");
        Student g2irl22 = new Student("Даша");
        Student g2irl23 = new Student("Алиса");
        Student g2irl24 = new Student("Полина");
        Student g2irl25 = new Student("Лера");
        Student g2irl26 = new Student("Валерия");

        StudentGroup studentGroup10 = new StudentGroup(g2irl26);
        studentGroup10.setName("Экономисты");
        studentGroup10.addStudentList(g2irl21);
        studentGroup10.addStudentList(g2irl22);
        studentGroup10.addStudentList(g2irl23);
        studentGroup10.addStudentList(g2irl24);
        studentGroup10.addStudentList(g2irl25);


        StudentStream studentStream = new StudentStream(studentGroup);
        studentStream.setName("First");
        studentStream.addGrouptList(studentGroup2);
        System.out.println(studentStream);
        System.out.println();
        studentStream.sortSG();
        System.out.println(studentStream);


        System.out.println();
        StudentStream studentStream2 = new StudentStream(studentGroup3);
        studentStream2.setName("Second");
        studentStream2.addGrouptList(studentGroup4);
        studentStream2.addGrouptList(studentGroup5);
        System.out.println(studentStream2);
        studentStream2.sortSG();
        System.out.println(studentStream2);

        System.out.println();
        StudentStream studentStream3 = new StudentStream(studentGroup5);
        studentStream3.setName("Third");
        studentStream3.addGrouptList(studentGroup6);
        studentStream3.addGrouptList(studentGroup7);
        studentStream3.addGrouptList(studentGroup8);
        studentStream3.addGrouptList(studentGroup9);
        studentStream3.addGrouptList(studentGroup10);
        System.out.println(studentStream3);
        studentStream3.sortSG();
        System.out.println(studentStream3);
        System.out.println();

        StreamServis streamServis = new StreamComparato();
        streamServis.addStreamList(studentStream);
        streamServis.addStreamList(studentStream3);
        streamServis.addStreamList(studentStream2);
        System.out.println(streamServis);
        streamServis.sortSC();
        System.out.println(streamServis);

    }
}
