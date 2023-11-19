package HomeMission3OOP;

import Seminar3OOP.StudyGroupIterator;

import java.util.ArrayList;

public class StudentGroup {

    public String name;

    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getName(){
        return name;
    }
    private ArrayList<Student> studentList= new ArrayList<>();
    public void addStudentList(Student name){
        this.studentList.add(name);
    }
    public StudentGroup(Student name){
        this.studentList.add(name);
    }
    public ArrayList<Student> getstudentList(){

        return studentList;
    }
    public ArrayList<Student> getStudentGroup(){
        return studentList;
    }
    @Override
    public String toString() {
        int count = studentList.size()-1;
        return "Группа "+name+": "+count;
    }
}
