package Trade;


import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args){

     PieceOfColbasa pieceOfColbasa = new PieceOfColbasa(1,20,"варенная");
     BottleOfCola bottleOfCola = new BottleOfCola(100,30);
     BottleOfCola bottleOfCola1l = new BottleOfCola(100,30);
     BottleOfCola bottleOfCola2l = new BottleOfCola(200,60);
     BottleOfCola bottleOfCola3l = new BottleOfCola(300,90);

    List<Products> colaList = new ArrayList<>(List.of(bottleOfCola1l,bottleOfCola2l,bottleOfCola3l)); // Добавление нескольких объектов

     VendingMachineOfCola vendingMachineOfCola = new VendingMachineOfCola();


     vendingMachineOfCola.initProducts(colaList);
    vendingMachineOfCola.printProduct("bottleOfCola2l");



//    List<Product> prodList = new ArrayList<>(List.of(bottleOfCola,pieceOfColbasa)); // Добавление нескольких объектов
//    Authomat authomat = new Authomat();
//       authomat.initProducts(prodList);
//     System.out.println();
//    authomat.printProduct("bottleOfCola");
//    Product cola = new Product("cola",33);
//    Product colbasa = new Product("colbasa",55);
//    Product milk = new Product("milk",40);
//    Product shocolat = new Product("shocolat",50);
//    prodList.add(cola);
//    prodList.add(colbasa);
//    prodList.add(milk);
//    prodList.add(shocolat);

 }
}
