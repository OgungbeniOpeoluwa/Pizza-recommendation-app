package pizzaRecommendingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaAppTest {
    PizzaApp pizzaApp;
    PizzaAppConstant pizza;
    SetOfAvailableStomachSlice slice;
    @BeforeEach
        public void setUp(){
        pizzaApp = new PizzaApp();

    }

    @Test
    public void testAppSliceOfPizza(){
        pizza = PizzaAppConstant.BIG;
        assertEquals(10,pizza.getSlice());
    }


    @Test
    public void testAppAvailability(){
        pizza = PizzaAppConstant.MEDIUM;
        assertEquals(6,pizza.getSlice());
    }
    @Test
    public void testForSliceOfPizza(){
        pizza = PizzaAppConstant.SMALL;
        assertEquals(4,pizza.getSlice());
    }
    @Test
    public void getPriceOfBigPizza(){
        pizza = PizzaAppConstant.BIG;
        assertEquals(5000,pizza.getPrice());
    }
    @Test
    public void orderForPizza(){
        slice = SetOfAvailableStomachSlice.HUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        slice = SetOfAvailableStomachSlice.CLASSIC;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        int expected = 30;
        assertEquals(expected,pizzaApp.getTotal());
    }
    @Test
    public void numberOfSliceForTwoPeople(){
       slice = SetOfAvailableStomachSlice.HUNGRY;
       String numberOfPeople = "5";
        int expected = 10;
        assertEquals(expected,pizzaApp.getNumberOfPeopleSlice(numberOfPeople,slice));

    }


    @Test
    public void numberOfSliceForThreePeople(){
        slice = SetOfAvailableStomachSlice.SUPPERHUNGRY;
         pizzaApp.getNumberOfPeopleSlice("4",slice);
        slice = SetOfAvailableStomachSlice.CLASSIC;
         pizzaApp.getNumberOfPeopleSlice("5",slice);
         slice = SetOfAvailableStomachSlice.HUNGRY;
         pizzaApp.getNumberOfPeopleSlice("3",slice);
         int expected = 27;
         assertEquals(expected,pizzaApp.getTotal());

    }

    @Test
    public void testForNumberOfBoxNeeded() {
        slice = SetOfAvailableStomachSlice.SUPPERHUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        slice = SetOfAvailableStomachSlice.CLASSIC;
        pizzaApp.getNumberOfPeopleSlice("5",slice);
        slice = SetOfAvailableStomachSlice.HUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        String size = "BIG";
        int expected = 7;
        assertEquals(expected,pizzaApp.getTotalNumberOfBoxes(size,pizzaApp.getTotal()));

    }

    @Test
    public void testForNumberOfSliceRemaining() {
        slice = SetOfAvailableStomachSlice.SUPPERHUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        slice = SetOfAvailableStomachSlice.CLASSIC;
        pizzaApp.getNumberOfPeopleSlice("5",slice);
        slice = SetOfAvailableStomachSlice.HUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        String size = "BIG";
        int expected = 5;
        assertEquals(expected,pizzaApp.getNumberOfSlicesRemain(size));

    }

    @Test
    public void testForPrice() {
        slice = SetOfAvailableStomachSlice.SUPPERHUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        slice = SetOfAvailableStomachSlice.CLASSIC;
        pizzaApp.getNumberOfPeopleSlice("5",slice);
        slice = SetOfAvailableStomachSlice.HUNGRY;
        pizzaApp.getNumberOfPeopleSlice("10",slice);
        String size = "BIG";
        int expected = 35000;
        assertEquals(expected,pizzaApp.getTotalPriceOfOrder(size));

    }@Test
    public  void testEnum(){
        PizzaAppConstant pizza = PizzaAppConstant.MEDIUM;
        assertEquals(3000,pizza.getPrice());
    }
    }


