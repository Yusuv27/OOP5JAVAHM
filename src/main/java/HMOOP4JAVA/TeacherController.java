package HMOOP4JAVA;

import java.util.ArrayList;

public class TeacherController implements Teacher{

    String name;
    int yea;
    String gender;
    int experience;

    private ArrayList list = new ArrayList();
    @Override
    public String getName() {
        if(name==null){
            name= "Нет данных";
        }
        return name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYea() {
        return yea;
    }

    @Override
    public void setYea(int yea) {
        this.yea = yea;
    }

    @Override
    public String getGender() {
        if(gender==null){
            gender="Нет данных";
        }

        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "TeacherController:" +
                " name:" + name  +
                " yea: " + yea +
                " gender: " + gender +
                " experience: " + experience+"\n";
    }
}
