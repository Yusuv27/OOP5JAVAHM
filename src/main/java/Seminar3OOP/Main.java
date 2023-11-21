package Seminar3OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
//      - Создать класс Студент
//      - Создать класс УчебнаяГруппаИтератор
//      - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//      - Реализовать его контракты (включая удаление)
    public static void main(String[] args){
        Student first = new Student("Vasya",20,3);
        Student second = new Student("Ivan",19,2);
        Student third = new Student("Alla",19,2);

        List<Student> studentsList = new ArrayList<>(List.of(first,second,third));
        StudyGroupIterator studyGroupIterator = new StudyGroupIterator(studentsList);

//        StudyGroupIterator studyGroupIterator = new StudyGroupIterator(List.of(first,second,third));

        System.out.println(studyGroupIterator);

        studyGroupIterator.setCurrentIndex((studyGroupIterator.searchStudent("Ivan",19,2)));
        studyGroupIterator.remove();
//        studyGroupIterator.setCurrentIndex(0);
        studyGroupIterator.reset();

        System.out.println("-".repeat(30));
//        studyGroupIterator.iterator();
        while (studyGroupIterator.hasNext()){
            System.out.println(studyGroupIterator.getStudent(studyGroupIterator.getCurrentIndex()));
//            System.out.println(studyGroupIterator.getCurrentIndex());
            studyGroupIterator.next();
        }
//        System.out.println(studyGroupIterator);
    }
}
