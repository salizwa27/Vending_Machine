package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

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
}
