package Seminar1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }
    public CandyBar getCandyBar (String name, int weight){
        for (Product product: products) {
            if (product instanceof CandyBar){
                CandyBar candyBar = (CandyBar) product;
                if (candyBar.getName().equals(name) && candyBar.getWeight() == weight){
                    return candyBar;
                }
            }
        }
        return null;
    }

}
