package de.czyrux.storesample.test;

import java.util.Arrays;
import java.util.Collections;

import de.czyrux.storesample.core.domain.cart.Cart;
import de.czyrux.storesample.core.domain.cart.CartProduct;

public class CartFakeCreator {

    public static Cart emptyCart() {
        return new Cart(Collections.emptyList());
    }

    public static Cart cartWithElements(CartProduct... products) {
        return new Cart(Arrays.asList(products));
    }
}
