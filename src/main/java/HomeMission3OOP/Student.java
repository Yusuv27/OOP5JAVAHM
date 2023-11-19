package HomeMission3OOP;

public class Student {
    protected String name;

    public Student(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "студент "+name;
    }
}
