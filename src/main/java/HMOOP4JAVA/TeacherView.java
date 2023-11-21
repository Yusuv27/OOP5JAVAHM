package HMOOP4JAVA;

public class TeacherView {
//    TeacherSevice name = new TeacherSevice();
    TeacherController name = new TeacherController();
    public void TV(String name1,int yea,String gender,int experience){
        this.name.setName(name1);
        this.name.setYea(yea);
        this.name.setGender(gender);
        this.name.setExperience(experience);
    }
    public void getTV(TeacherController name1){
        System.out.println("Имя: "+name1.getName());
        System.out.println("Возраст: "+name1.getYea()+" лет");
        System.out.println("Пол: "+name1.getGender());
        System.out.println("Опыт: "+name1.getExperience()+" года");
        System.out.println();
    }
    @Override
    public String toString() {
        return "TeatcherView работает исправно!\n"+name;
    }
}
