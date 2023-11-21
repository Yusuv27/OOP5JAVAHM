package Trade;

public class PieceOfColbasa extends Products {
    int mass;
    String type;

    public  String getType(){
        return type;
    }
    public int getmass(){
        return  mass;
    }
public PieceOfColbasa(int mass,int cost,String type){
        this.type = type;
        this.name="pieceOfColbasa";
        this.cost=cost;
        this.mass=mass;
}

    @Override
    public String toString() {
        return "name: " + name +
                " , mass: " + mass +
                " , cost: " + cost +
                " , type: " + type;
    }
}
