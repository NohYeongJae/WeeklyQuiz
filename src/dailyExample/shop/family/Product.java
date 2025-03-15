package dailyExample.shop.family;

import dailyExample.shop.policy.Promotion;

import java.util.List;

public class Product {
    protected static String name;
    protected int price;
    protected int weight;
    protected int discountAmount;
    protected Promotion promotion;

    public Product(String name, int price, int weight, int discountAmount, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discountAmount = discountAmount;
        this.promotion = promotion;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }
    public int finalPrice() {
        return price - promotion.getDiscountAmount(this);
    }

    public static int shippingFee(List<Product> products) {

        int totalWeight = 0;
        int totalPrice = 0;

        for(Product product : products){
            totalWeight += product.weight;
            totalPrice += product.finalPrice();
        }

        int baseFee;
        if (totalWeight < 3) {
            baseFee = 1000;
        } else if (totalWeight < 10) {
            baseFee = 5000;
        } else {
            baseFee = 10000;
        }

        if (totalPrice >= 100000) {
            return 0;
        } else if (totalPrice >= 30000) {
            baseFee -= 1000;
        }
        return baseFee;
    }


}

