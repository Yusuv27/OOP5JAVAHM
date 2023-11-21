package Trade;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineOfCola implements Authomat {
    public List<Products> list = new ArrayList<>();

    @Override
    public void initProducts(List<Products> newList) {
        this.list = newList;
        System.out.println();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }

    @Override
    public void printProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println("Продукт: " + list.get(i).getName() + " , цена: " + list.get(i).getCost());
            }
        }
    }
}
