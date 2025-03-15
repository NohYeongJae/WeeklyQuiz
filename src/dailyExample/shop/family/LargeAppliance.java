package dailyExample.shop.family;

import dailyExample.shop.policy.SalePromotion;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight, 0, new SalePromotion());
    }
}
