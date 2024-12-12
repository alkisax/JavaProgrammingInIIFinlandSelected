import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> productsPrices;
    private Map<String,Integer> productsStock;

    public Warehouse(){
        this.productsPrices = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrices.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product){
        if (!this.productsPrices.containsKey(product)){
            return -99;
        }
        int price = this.productsPrices.get(product);
        return price;
    }

    public int stock(String product) {
        if(!this.productsStock.containsKey(product)) {
            return 0;
        }
        return this.productsStock.get(product);
    }

    public boolean take(String product) {
        if (this.stock(product) == 0){
            return false;
        }
        int newValue = this.productsStock.get(product) - 1;
        this.productsStock.put(product, newValue);
        return true;
    }

    public Set<String> products(){
        Set<String> keys = new HashSet<>();
        keys = this.productsPrices.keySet();
        return keys;
    }

}
