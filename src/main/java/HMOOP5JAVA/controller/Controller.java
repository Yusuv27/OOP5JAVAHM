package HMOOP5JAVA.controller;

import HMOOP5JAVA.data.GroupDrink;
import HMOOP5JAVA.data.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<GroupDrink> stream = new ArrayList<>();
    public void addGroupDrink(GroupDrink group){
        stream.add(group);
    }
    public void addGroupDrink(Integer id,String name, Integer temperature, Integer cost,Integer idHotDrink){
        getGroupDrinkById(id).addDrink(new HotDrink(name,temperature,cost,idHotDrink));
    }
    public static void setStream(List<GroupDrink> stream) {
        Controller.stream = stream;
    }

    public static List<GroupDrink> getStream() {
        return stream;
    }
    public static GroupDrink getGroupDrinkById(Integer id){
        for (GroupDrink groupDrink:stream) {
            if(groupDrink.getId()==id){
                return groupDrink;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String strstream = stream.toString().replace("[","").replace("]","");
        return "Controller: "+strstream;
    }
}
