package HMOOP4JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupOfTeatcher {
    ArrayList<TeacherSevice> name = new ArrayList();

    public void add(TeacherSevice name1){
        name.add(name1);
    }

    @Override
    public String toString() {
        String n = "GroupOfTeacher: " + name;
        return "Начало списка:\n"+"*".repeat(70)+"\n"+n.replace("[","").replace("]","").replace(",","").replace("TeacherController: ","").replace("TeacherSevice: ","").replace("GroupOfTeacher: ","Список учителей: ")+"\n"+"*".repeat(70)+"\nКонец списка.";
    }
    public void nextTeacher(String name1){
        int count = 0;
        System.out.println("Результаты поиска по запросу "+'"'+name1+'"'+":");
        for (int i = 0; i < name.size(); i++) {
            if(name1==(name.get(i).getNameTS())) {
                String str = name.get(i).toString();
                System.out.println(str.replace("TeacherSevice:","").replace("TeacherController: ","").replace("\n ",""));
                count++;
            }
        }
        if (count==0){
            System.out.println("Ничего не найдено");
        }
    }
    public void redactor(String name1,String name2,int yea,String gender,int experience){
        int count = 0;
        System.out.println("Заменено!");
        for (int i = 0; i < name.size(); i++) {
            if(name1==(name.get(i).getNameTS())) {
                String str = name.get(i).toString();
                System.out.println(str.replace("TeacherSevice:","").replace("TeacherController: ","").replace("\n ",""));
                name.get(i).TV(name2,yea,gender,experience);
                str = name.get(i).toString();
                System.out.println(str.replace("TeacherSevice:","").replace("TeacherController: ","").replace("\n ",""));
                count++;
            }
        }
        if (count==0){
            System.out.println("Ничего не найдено");
        }
    }
}

