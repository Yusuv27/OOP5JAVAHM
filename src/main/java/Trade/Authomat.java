package Trade;

import java.util.List;

public interface Authomat {

    void initProducts(List<Products> newList);
    void printProduct(String name );


//    public List<Product> list = new ArrayList<>();
//    public void initProducts(List<Product> newList){
//        this.list= newList;
//        System.out.println();
//        for (int i = 0; i < newList.size(); i++) {
//            System.out.println(newList.get(i));
//        }
//    }
//
//    public void printProduct(String name ){
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).getName().equals(name)){
//                System.out.println("Продукт: "+list.get(i).getName()+" , цена: "+list.get(i).getCost());
//            }
//        }
//    }
}
