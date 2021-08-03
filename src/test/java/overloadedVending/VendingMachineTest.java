package overloadedVending;

import org.junit.jupiter.api.Test;
import overloadedVending.product.Chocolate;
import overloadedVending.product.SaltySnack;
import overloadedVending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {


    @Test
    public void shouldDescribeTheTypeOfSnackSoftDrink() {
        SoftDrink softDrinks = new SoftDrink();
        assertEquals("This is a Soft Drink", softDrinks.description());
    }

    @Test
    public void shouldDescribeTheTypeOfSnackSaltySnack() {
        SaltySnack saltySnacks = new SaltySnack();
        assertEquals("This is a SaltY Snack", saltySnacks.description());
    }

    @Test
    public void shouldDescribeTheTypeOfSnackChocolate() {
        Chocolate chocolates = new Chocolate();
        assertEquals("This is a chocolate", chocolates.description());
    }

    @Test
    public void shouldBeAbleToAddTypeOfSnackChocolate() {
        Chocolate chocolates = new Chocolate();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.addStock(chocolates);
        overloadedVendingMachine.addStock(chocolates);

        assertEquals(5, overloadedVendingMachine.getStock(chocolates));

    }

    @Test
    public void shouldBeAbleToAddTypeOfSnackSoftdrink() {
        SoftDrink softDrinks = new SoftDrink();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.addStock(softDrinks);
        overloadedVendingMachine.addStock(softDrinks);
        overloadedVendingMachine.addStock(softDrinks);
        overloadedVendingMachine.addStock(softDrinks);

        assertEquals(7, overloadedVendingMachine.getStock(softDrinks));

    }

    @Test
    public void shouldBeAbleToAddTypeOfSnackSaltySnack() {
        SaltySnack saltySnacks = new SaltySnack();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.addStock(saltySnacks);

        assertEquals(4, overloadedVendingMachine.getStock(saltySnacks));

    }

    @Test
    public void shouldBeAbleToBuyTypeOfSnackChocolate() {
        Chocolate chocolates = new Chocolate();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.buy(chocolates);
        overloadedVendingMachine.buy(chocolates);

        assertEquals(1, overloadedVendingMachine.getStock(chocolates));

    }

    @Test
    public void shouldBeAbleToBuyTypeOfSnackSoftdrink() {
        SoftDrink softDrinks = new SoftDrink();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.buy(softDrinks);
        overloadedVendingMachine.buy(softDrinks);


        assertEquals(1, overloadedVendingMachine.getStock(softDrinks));

    }

    @Test
    public void shouldBeAbleToBuyTypeOfSnackSaltySnack() {
        SaltySnack saltySnacks = new SaltySnack();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);
        overloadedVendingMachine.buy(saltySnacks);

        assertEquals(2, overloadedVendingMachine.getStock(saltySnacks));

    }
}
