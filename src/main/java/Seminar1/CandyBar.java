package Seminar1;

public class CandyBar extends Product {
    /**
     * Вес шоколадного батончика
     */
    private int weight;
    /**
     * Начинка
     */
    private String topping;

    public int getWeight() {
        return weight;
    }

    public String getTopping() {
        return topping;
    }

    public CandyBar (String brand, String name, double price, int weight, String topping) {
        super(brand, name, price);
        this.weight = weight;
        this.topping = topping;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадный батончик]\n%s - %s - %.2f;\nВес: %d гр.\nНачинка: %s",
                brand, name, price, weight, topping);
    }
}
