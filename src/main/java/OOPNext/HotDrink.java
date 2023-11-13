package OOPNext;

public class HotDrink extends Product {



    public HotDrink(int volume, int cost, String name, int temperature){
        this.name=name;
        this.cost=cost;
        this.volume=volume;
        this.temperature= temperature;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " , cost: " + cost +
                " , volume: " + volume +
                " , temperature: " + temperature;
    }
}
