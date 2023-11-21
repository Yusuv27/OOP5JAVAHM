package HMOOP4JAVA;

public class TeacherSevice extends GroupOfTeatcher{
    TeacherController name2 = new TeacherController();

    public void  TV(String name,int yea,String gender,int experience){
        TeacherView name3 = new TeacherView();
        name3.TV(name,yea,gender,experience);
        this.name2.setName(name);
        this.name2.setYea(yea);
        this.name2.setGender(gender);
        this.name2.setExperience(experience);
        System.out.println(name3);
    }
    public void get(){
        TeacherView nameTV= new TeacherView();
        nameTV.getTV(name2);
    }
    public String getNameTS(){
        String name4=name2.getName();
        return name4;
    }
    @Override
    public String toString() {
        return "\nTeacherSevice: \n" + name2;
    }
}
