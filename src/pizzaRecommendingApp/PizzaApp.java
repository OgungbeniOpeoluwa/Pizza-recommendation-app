package pizzaRecommendingApp;

public class PizzaApp {
    private int total;



    public int getNumberOfPeopleSlice(String numberOfPeople ,SetOfAvailableStomachSlice typeOfPeople){
        return  total += typeOfPeople.getSliceConsume() *Integer.parseInt( numberOfPeople);
    }

    public int getTotal(){
         return total;
    }
    public int getTotalNumberOfBoxes(String typeOfBox,int results) {
        results = getTotal();
        PizzaAppConstant pizzas = PizzaAppConstant.valueOf(typeOfBox.toUpperCase());
        int slice = pizzas.getSlice();
        int result;
        if(results % slice != 0){
            int number = total / slice;
            result = number + 1;
        }
        else{
            result = total / slice;
        }
        return result;
    }



    public int getNumberOfSlicesRemain(String typeOfBox) {
        PizzaAppConstant boxSize = PizzaAppConstant.valueOf(typeOfBox.toUpperCase());
        int numberOfBoxes = getTotalNumberOfBoxes(typeOfBox,getTotal());
        int actualSlice = boxSize.getSlice();
        int result = numberOfBoxes * actualSlice;
        return result - total;
    }



    public int getTotalPriceOfOrder(String typeOfBox) {
        PizzaAppConstant price = PizzaAppConstant.valueOf(typeOfBox.toUpperCase());;
        return price.getPrice() * getTotalNumberOfBoxes(typeOfBox,getTotal());
    }

}