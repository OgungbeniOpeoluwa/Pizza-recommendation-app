package pizzaRecommendingApp;

public class PizzaAppMain {
    public static void main(String[] args) {
        DisplayOfApp app = new DisplayOfApp();
        boolean returns;
        do {
            try {
                app.checkInput();
                returns = false;
            } catch (IllegalArgumentException wrongInput) {
                System.out.println(wrongInput.getMessage());
                returns = true;
            }
        } while (returns);

    }


    }



