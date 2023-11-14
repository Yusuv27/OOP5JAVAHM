package Mission_1_2;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void Market1(Actor name,List list){
        Market pos = new Market();
        pos.acceptToMarket(name);
        System.out.println(name);
        list.add(name);
        System.out.println();

        name.setMakeOrder();

        pos.giveOrders();
        System.out.println(name);
        System.out.println();

        name.setTakeOrder();

        pos.takeInQueue(name);//Зайти в очередь
        System.out.println(name);
        System.out.println();
    }
    public static void Market2(Actor name,List list) {
        Market pos = new Market();

        pos.takeOrders();
        System.out.println(name);
        System.out.println();

        pos.releaseFromQueue();
        System.out.println(name);
        System.out.println();

        pos.releaseFromMarket(list);
        System.out.println(name);
    }
        public static void main (String[] args){
        Market pos = new Market();
        Actor name = new Human();
        name.setName("Александр");
        Actor name2= new Human();
        name2.setName("Илья");

        List<Actor> list= new ArrayList<>(); // Люди в магазине
        Market1(name,list);
        Market1(name2,list);
        pos.update(list);
        Market2(list.get(0),list);
        pos.update(list);
        Market2(list.get(0),list);

    }
}
