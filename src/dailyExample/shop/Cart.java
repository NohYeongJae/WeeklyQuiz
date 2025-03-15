package dailyExample.shop;

import dailyExample.shop.family.Product;

import java.util.Arrays;
import java.util.List;

public class Cart {
    private final List<Product> products;  // Product 리스트

    public Cart(Product[] products) {
        this.products = Arrays.asList(products);  // 배열을 리스트로 변환
    }

    public int calculateDeliveryCharge() {
        return Product.shippingFee(products);
    }
}
