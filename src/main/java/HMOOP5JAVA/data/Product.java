package HMOOP5JAVA.data;

public abstract class Product {
    protected String name;
    protected Integer temperature;
    protected Integer cost;
    public Product(){}
    public Product(String name,Integer temperature,Integer cost){
        this.name = name;
        this.temperature = temperature;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
