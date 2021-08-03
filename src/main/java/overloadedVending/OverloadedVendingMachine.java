package overloadedVending;

import overloadedVending.product.*;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    // add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor

        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    void buy(SoftDrink softdrink){

        if (softdrink != null){
            softDrinkQty -- ;
        }
    }

    void buy(SaltySnack saltySnack){

        if (saltySnack != null){
            saltySnacksQty -- ;
        }

    }

    void buy(Chocolate chocolate){

        if (chocolate != null){
            chocolatesQty -- ;
        }

    }

    void buy(Product product){

        softDrinkQty = softDrinkQty -- ;
        saltySnacksQty = saltySnacksQty -- ;
        chocolatesQty = chocolatesQty -- ;
    }

    void addStock(SoftDrink softdrink){

        if (softdrink != null){
            softDrinkQty ++ ;
        }
    }

    void addStock(SaltySnack saltySnack){

        if (saltySnack != null){
            saltySnacksQty ++ ;
        }
    }

    void addStock(Chocolate chocolate){
        if (chocolate != null){
            chocolatesQty ++ ;
        }
    }

    void addStock(Product product){

        softDrinkQty = softDrinkQty ++ ;
        saltySnacksQty = saltySnacksQty ++ ;
        chocolatesQty = chocolatesQty ++ ;

    }

    int getStock(SoftDrink softdrink){
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }

    int getStock(Chocolate chocolate){
        return chocolatesQty;
    }

    int getStock(){
        return softDrinkQty + saltySnacksQty + chocolatesQty;
    }

}
