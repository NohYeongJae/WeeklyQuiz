package dailyExample.shop;

import dailyExample.shop.family.Beauty;
import dailyExample.shop.family.Grocery;
import dailyExample.shop.family.LargeAppliance;
import dailyExample.shop.family.Product;

public class ShoppingMallCalculate {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

        Cart cart = new Cart(new Product[]{beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);
    }
}
