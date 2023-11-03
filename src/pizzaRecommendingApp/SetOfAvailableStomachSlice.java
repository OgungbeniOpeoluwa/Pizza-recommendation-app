package pizzaRecommendingApp;

public enum SetOfAvailableStomachSlice {
    HUNGRY(2), SUPPERHUNGRY(4),CLASSIC(1);
    private final int sliceConsume;

    SetOfAvailableStomachSlice(int sliceConsume) {
        this.sliceConsume = sliceConsume;
    }
    public  int getSliceConsume(){
        return sliceConsume;
    }

}
