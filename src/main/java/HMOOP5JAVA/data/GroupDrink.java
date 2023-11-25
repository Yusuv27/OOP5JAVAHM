package HMOOP5JAVA.data;

import java.util.ArrayList;
import java.util.List;

public class GroupDrink {
    private List<HotDrink> drinkList = new ArrayList<>();
    private HotDrink hotDrink = new HotDrink();
    private Integer id;

    public void addDrink(HotDrink hotDrink){
        this.drinkList.add(hotDrink);
    }
    public GroupDrink(ArrayList<HotDrink>drinkList,Integer id){
        this.drinkList=drinkList;
        this.id=id;
    }
    public void createHotDrink(String name,int temperature,int cost,int idHotDrink){
        hotDrink.setName(name);
        hotDrink.setTemperature(temperature);
        hotDrink.setCost(cost);
        hotDrink.setIdHotDrink(idHotDrink);
    }

    public List<HotDrink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<HotDrink> drinkList) {
        this.drinkList = drinkList;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n GroupDrink: " +
                "\n   drinkList: " + drinkList +
                "\nid: " + id;
    }
}
