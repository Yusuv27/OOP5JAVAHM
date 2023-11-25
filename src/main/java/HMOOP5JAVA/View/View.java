package HMOOP5JAVA.View;

import HMOOP5JAVA.controller.Controller;
import HMOOP5JAVA.data.GroupDrink;

import java.lang.module.Configuration;

public class View {
    Controller controller = new Controller();
    public void createGroupDrink(GroupDrink groupDrink){
        controller.addGroupDrink(groupDrink);
    }
    public void createHotDrink(Integer id,String name, Integer temperature, Integer cost,Integer idHotDrink){
        controller.addGroupDrink(id,name,temperature,cost,idHotDrink);
    }
    public void printInfo(){
        System.out.println(controller);
    }
    public void printlnInfo(){
        System.out.println();
        System.out.println(controller);
    }
}
