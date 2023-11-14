package Mission_1_2;

import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Market implements QueueBehaviour,MarketBehaviour{

    boolean Entrance;
    List <Actor> actors;
    Queue<Actor> que; // Очередь
    int counter=1;

    //Вход в магазин
    //Сделать заказ
    //Зайти в очередь
    //Выполнить заказ
    //Выход из очереди
    //Выход из магазина

    //Обновление
    @Override
    public void acceptToMarket(Actor actor) { //Вход в магазин
        Entrance=true;
        System.out.println("Зашел в магазин!");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) { //Выход из магазина
        actors.remove(0);
        System.out.println("Вышел из магазина!");
    }

    @Override
    public void update(List<Actor> actors) {  //Обновление
        System.out.println();
        System.out.println("Состояние очереди: "+ actors);
        System.out.println();
    }

    @Override
    public void takeInQueue(Actor actor) { //Зайти в очередь
        System.out.println("Зашел в очередь!");
    }

    @Override
    public void takeOrders() { // Выполнение заказа
        System.out.println("Заказ выполнен!");
    }

    @Override
    public void giveOrders() { // Сделать заказ
//        counter=1;
//        actors.add();
        System.out.println("Заказ сделан!");
    }

    @Override
    public void releaseFromQueue() { // Выход из очереди
        System.out.println("Вышел из очереди");
    }
}
