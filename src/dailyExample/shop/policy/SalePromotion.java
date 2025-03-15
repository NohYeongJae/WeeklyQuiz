package dailyExample.shop.policy;

import dailyExample.shop.family.Product;

public class SalePromotion implements Promotion {
    @Override
    public int getDiscountAmount(Product product) {
        return product.getDiscountAmount();
    }
}
