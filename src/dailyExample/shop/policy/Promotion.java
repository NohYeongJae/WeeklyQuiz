package dailyExample.shop.policy;

import dailyExample.shop.family.Product;

public interface Promotion {

    int getDiscountAmount(Product product);

}
