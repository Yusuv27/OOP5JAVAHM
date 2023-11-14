package Mission_1_2;

public abstract class Actor implements ActorBehoviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {return isTakeOrder;}
    public void setMakeOrder(boolean makeOrder) {isMakeOrder = makeOrder;}
    public void setTakeOrder(boolean takeOrder) {isTakeOrder = takeOrder;}


}