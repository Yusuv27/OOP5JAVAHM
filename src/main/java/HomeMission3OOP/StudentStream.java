package HomeMission3OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StudentStream implements Iterable<Student>{
    public String name;


    private ArrayList<StudentGroup> SSList= new ArrayList<>();
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getName(){
        return name;
    }
    public void addGrouptList(StudentGroup name){
        this.SSList.add(name);
    }
    public StudentStream(StudentGroup name){
        this.SSList.add(name);
    }


    public void sortSG(){
        ArrayList<Integer> countList= new ArrayList<>();
        for (int i = 0; i < SSList.size(); i++) {
                String str1 = String.valueOf(SSList.get(i));
                String[] str2 = str1.split(" ");
                int str3 = Integer.parseInt(str2[str2.length-1]);
                countList.add(str3);
        }
        System.out.println();
                System.out.println("СОРТИРОВКА ПОТОКА: "+name);
        System.out.println();
        for (int j = 0; j < SSList.size(); j++) {
            for (int i = 0; i < SSList.size(); i++) {
                if (i == SSList.size() - 1) {
                    break;
                }
                if (countList.get(i) < countList.get(i + 1)) {
                    Collections.swap(countList, i, i + 1);
                    Collections.swap(SSList, i, i + 1);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "\nПоток "+name+": "+SSList+"\nКоличество групп: "+SSList.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
