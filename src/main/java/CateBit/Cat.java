package CateBit;

// alt + ins => ctrl + a =>ok
public class Cat{
    protected String name;
    protected int age;
    //set - устанавливаем
    //get - получаем

    public void printInfo(){
        System.out.println("meow! my name is "+name+" my age is "+ age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Информация CateBit.Cat{" +
                "name = " + name  +
                ", age=" + age +
                '}';
    }

}
