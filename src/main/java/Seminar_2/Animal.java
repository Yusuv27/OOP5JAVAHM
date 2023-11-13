package Seminar_2;

public abstract class Animal implements Zoo, AnimalBehaivour{
    protected String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    abstract void voice();
}
