package HMOOP5JAVA;

import HMOOP5JAVA.View.View;
import HMOOP5JAVA.data.GroupDrink;
import HMOOP5JAVA.data.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        HotDrink hotDrink = new HotDrink("Latte сoffee",65,120,1);
        HotDrink hotDrink2 = new HotDrink("Cappuccino сoffee",65,120,2);
        HotDrink hotDrink3 = new HotDrink("Raf coffee",65,130,3);
        HotDrink hotDrink4 = new HotDrink("Black tea",65,60,4);
//        HotDrink hotDrink5 = new HotDrink("Green tea",65,60,5);

        view.createGroupDrink(new GroupDrink(new ArrayList<>(List.of(hotDrink,hotDrink2,hotDrink3,hotDrink4)),1));
//        view.printlnInfo();
        view.createHotDrink(1,"Green tea",65,60,5);
        view.printlnInfo();
    }
}
