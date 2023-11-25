package HMOOP5JAVA.data;

public class HotDrink extends Product{
    private Integer idHotDrink;
    public HotDrink(String name,int temperature,int cost,int idHotDrink){
        super(name,temperature,cost);
        this.idHotDrink = idHotDrink;
    }
    public HotDrink(){}


    public Integer getIdHotDrink() {
        return idHotDrink;
    }

    public void setIdHotDrink(Integer idHotDrink) {
        this.idHotDrink = idHotDrink;
    }

    @Override
    public String toString() {
        return "\n      HotDrink: " +
                "\n         idHotDrink: " + idHotDrink +
                "\n         name: " + name +
                "\n         temperature: " + temperature +
                "\n         cost: " + cost;
    }
}
