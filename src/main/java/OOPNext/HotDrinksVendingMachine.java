package OOPNext;


import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    public List<Product> list = new ArrayList<>();
    /**
     * Вывод по каждому продукту (из ArrayList по индексу)
     * */
    @Override
    public void printPro(List<Product> newList) {
        this.list = newList;
        System.out.println();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

    }
    /**
     *Поиск по названию
     * */
    @Override
    public void toFindProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                System.out.println("Продукт: "+list.get(i).getName()+" , "+list.get(i).getVolume()+" мл , цена: "+list.get(i).getCost());
            }
        }
    }
    /**
     * Поиск по объему
     * */
    @Override
    public void toFindProductVolume(int volume){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getVolume()==volume){
                System.out.println("Продукт: "+list.get(i).getName()+" , "+list.get(i).getVolume()+" мл , цена: "+list.get(i).getCost());
            }
        }
    }
}
