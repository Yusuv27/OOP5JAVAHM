package OOPNext;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Main {
    public static void main(String[] args) {

        HotDrink latte300 = new HotDrink(300, 125, "latte", 75);
        HotDrink cappuccino300 = new HotDrink(300, 125, "cappuccino", 75);
        HotDrink blacktea300 = new HotDrink(300, 125, "blacktea", 75);
        HotDrink greentea300 = new HotDrink(300, 125, "greentea", 75);

        HotDrink latte400 = new HotDrink(400, 150, "latte", 75);
        HotDrink cappuccino400 = new HotDrink(400, 150, "cappuccino", 75);
        HotDrink blacktea400 = new HotDrink(400, 150, "blacktea", 75);
        HotDrink greentea400 = new HotDrink(400, 150, "greentea", 75);

        HotDrink latte500 = new HotDrink(500, 175, "latte", 75);
        HotDrink cappuccino500 = new HotDrink(500, 175, "cappuccino", 75);
        HotDrink blacktea500 = new HotDrink(500, 175, "blacktea", 75);
        HotDrink greentea500 = new HotDrink(500, 175, "greentea", 75);


        List<Product> hotList = new ArrayList<>(List.of(latte300,cappuccino300,blacktea300,greentea300,latte400, cappuccino400, blacktea400, greentea400,latte500,cappuccino500,blacktea500, greentea500));

        System.out.println(hotList);
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        hotDrinksVendingMachine.printPro(hotList);
        System.out.println();
        hotDrinksVendingMachine.toFindProduct("latte");
        System.out.println();
        hotDrinksVendingMachine.toFindProductVolume(400);
    }
}

