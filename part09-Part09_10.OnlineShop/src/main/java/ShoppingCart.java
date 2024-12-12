import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
            // qty += this.cart.get(product).getQty();
        } else {
            Item item = new Item(product, 1, price);
            cart.put(product, item);
        }
    }

    public int price(){
        int price = 0;
        for (Item item: this.cart.values()){
            price += item.price();
        }
        return price;
    }

    public void print(){
        for(Item item: this.cart.values()){
            System.out.println(item);
        }
    }
}
