package overloadedVending;

import overloadedVending.product.Chocolate;
import overloadedVending.product.Product;
import overloadedVending.product.SaltySnack;
import overloadedVending.product.SoftDrink;

public class Main {

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 3, 3);

        SoftDrink softDrinks = new SoftDrink();
        SaltySnack saltySnacks = new SaltySnack();
        Chocolate chocolates = new Chocolate();
        Product products = new Product();

        overloadedVendingMachine.addStock(softDrinks);
        overloadedVendingMachine.addStock(softDrinks);
        overloadedVendingMachine.addStock(softDrinks);

        overloadedVendingMachine.addStock(saltySnacks);
        overloadedVendingMachine.addStock(saltySnacks);
        overloadedVendingMachine.addStock(saltySnacks);

        overloadedVendingMachine.addStock(chocolates);
        overloadedVendingMachine.addStock(chocolates);
//        overloadedVendingMachine.addStock(chocolates);

        overloadedVendingMachine.addStock(products);

        overloadedVendingMachine.buy(softDrinks);
        overloadedVendingMachine.buy(saltySnacks);
        overloadedVendingMachine.buy(chocolates);
        overloadedVendingMachine.buy(products);

        System.out.println(softDrinks.description() + " " + overloadedVendingMachine.getStock(softDrinks));
        System.out.println(saltySnacks.description() + " " +overloadedVendingMachine.getStock(saltySnacks));
        System.out.println(chocolates.description() + " " +overloadedVendingMachine.getStock(chocolates));

    }
}
