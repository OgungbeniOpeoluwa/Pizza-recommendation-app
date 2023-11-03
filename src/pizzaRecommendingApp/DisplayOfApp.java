package pizzaRecommendingApp;

import java.util.Scanner;

public class DisplayOfApp {

    PizzaApp pizza = new PizzaApp();


    public void displayAvailableBoxes(){
        for (PizzaAppConstant result : PizzaAppConstant.values()) {
            System.out.println(result );
        }
    }


    public void  customersOrderInputs(){
        for(SetOfAvailableStomachSlice numb : SetOfAvailableStomachSlice.values()) {
            System.out.print(numb + " ");
            String numbs = collectInput();
            pizza.getNumberOfPeopleSlice(numbs,numb);
        }

    }

    public void checkInput() {
        displayAvailableBoxes();
        System.out.println();
        String input = sizePreferred();
        if ((input.equalsIgnoreCase("BIG") || input.equalsIgnoreCase("MEDIUM") || input.equalsIgnoreCase("SMALL"))) {
            customersOrderInputs();
            displayOrder(input);

        }
        else{
            throw new IllegalArgumentException("Invalid Input");
        }
    }


    public String sizePreferred(){
        System.out.println("Enter your Preferred Box size among the available pizza size listed above: ");
        return collectInput();
    }

    private String collectInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    public void displayOrder(String typeOfBox){
        System.out.println("Number of Slices needed: "+ pizza.getTotal());
        System.out.println("Number of boxes: " + pizza.getTotalNumberOfBoxes(typeOfBox, pizza.getTotal()));
        System.out.println("Number of slices left: " + pizza.getNumberOfSlicesRemain(typeOfBox));
        System.out.println("Total Price: " + pizza.getTotalPriceOfOrder(typeOfBox));

    }
}
