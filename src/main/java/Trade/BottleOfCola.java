package Trade;

public class BottleOfCola extends Products {

    final String name = "bottleOfCola" ;

    int volumeSize;

    public int getVolumeSize(){
        return volumeSize;
    }
    public String getName(){
        return name;
    }
    public BottleOfCola(int volumeSize, int cost) {
        this.cost = cost;
        this.volumeSize = volumeSize;
    }

//    public int getCost(){
//        return cost;
//    }

    @Override
    public String toString() {
        return "name: "+ name +
                " , cost: " + cost+" , volumeSize: "+ volumeSize;
    }
}
