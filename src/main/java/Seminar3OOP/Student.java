package Seminar3OOP;

public class Student {
    protected String name;
    protected  int age;
    protected int yearofStudy;

    public Student(String name, int age, int yearofStudy) {
        this.name = name;
        this.age = age;
        this.yearofStudy = yearofStudy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearofStudy() {
        return yearofStudy;
    }

    @Override
    public String toString() {
        return "Student" +
                " Name: " + name +
                " Age: " + age +
                " YearofStudy: " + yearofStudy + "\n";

    }
}
