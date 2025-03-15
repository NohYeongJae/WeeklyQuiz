package dailyExample.shop.family;

import dailyExample.shop.policy.SalePromotion;

public class Beauty extends Product {
    public Beauty(String name, int price, int weight) {
        super(name, price, weight, 10000, new SalePromotion());

    }
}
