package pizzaRecommendingApp;

public enum PizzaAppConstant {
    BIG(10,5000), MEDIUM(6,3000), SMALL(4,1200);

private final int price;
private final int slice;
    PizzaAppConstant(int slice, int price) {
        this.price = price;
        this.slice = slice;
    }
    public int getPrice(){
        return price;
    }
    public int getSlice(){
        return slice;
    }
}

