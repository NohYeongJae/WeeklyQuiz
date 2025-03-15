package dailyExample.shop.family;

import dailyExample.shop.policy.SalePromotion;

public class Grocery extends Product {
    public Grocery(String name, int price, int weight) {
        super(name, price, weight, 2000, new SalePromotion());
    }
}
