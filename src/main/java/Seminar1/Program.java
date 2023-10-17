package Seminar1;
/* Домашенее задаие:
1. Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории)
   и включить в список продуктов в вендинг машину.
2. Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
 */
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
        // product1.name = "Продукт #1";
        // product1.brand = "Производитель #1";
        // product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product();

        System.out.println(product2.displayInfo());

        Product product3 = new Product("Производитель #2", "Продукт #2", 325);

        System.out.println(product3.displayInfo());

        Product bottleOfWater = new BottleOfWater("ООО Источник", "Бутылка с водой #1", 200, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #1", 220, 1.5, 25);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #2", 120, 1.0, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #3", 320, 1.0, 15);
        System.out.println(bottleOfMilk3.displayInfo());

        System.out.println("-".repeat(30));


        Product candyBar1 = new CandyBar("ООО Марс", "Марс", 137, 81, "Карамель");
        System.out.println(candyBar1.displayInfo());
        Product candyBar2 = new CandyBar("ООО Марс", "Милки Вей", 120, 95, "Суфле");
        System.out.println(candyBar2.displayInfo());
        Product candyBar3 = new CandyBar("ООО «Нестле Россия»", "Натс", 112, 81, "Лесной орех");
        System.out.println(candyBar3.displayInfo());
        Product candyBar4 = new CandyBar("ООО «Нестле Россия»", "Кит Кат", 105, 73, "Вафли");
        System.out.println(candyBar4.displayInfo());
        System.out.println("-".repeat(30));

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(candyBar1);
        products.add(candyBar2);
        products.add(candyBar3);
        products.add(candyBar4);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком #2", 1);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в  автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        System.out.println("-".repeat(30));
        CandyBar candyBar = vendingMachine.getCandyBar("Марс", 81);
        if (candyBar == null){
            System.out.println("Такого батончика нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(candyBar.displayInfo());
        }

    }
}
