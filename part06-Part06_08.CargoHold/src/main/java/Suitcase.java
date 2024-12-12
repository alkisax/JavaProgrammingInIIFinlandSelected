import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> list;
    private int maximumWeight;

        public Suitcase (int maximumWeight) {
            this.list = new ArrayList<>();
            this.maximumWeight = maximumWeight;
        }

        public void addItem(Item item) {
            if ((item.getWeight() + this.totalWeight()) <= maximumWeight) {
                list.add(item);
            }
        }

        public int totalWeight () {
            int totalWeight = 0;
            for (Item item: list) {
                totalWeight += item.getWeight();
            }
            return totalWeight;
        }

        public Item heaviestItem () {
            int heavyWeight = Integer.MIN_VALUE;
            Item heaviestItem = null;
            for (Item item: list) {
                if (item.getWeight() > heavyWeight) {
                    heavyWeight = item.getWeight();
                    heaviestItem = item;
                }
            }
            return heaviestItem; 
        }

        public void printItems () {
            if (list.size() == 0) {
                System.out.println("\"The suitcase is empty.\"");  
            } else {
                for (Item item: list) {
                    System.out.println(item);
                }
            }
        }

        public String toString() {
            if (list.size() == 1) {
                return "1 item (" + this.totalWeight() + " kg)";
            } else if (list.size() == 0){
                return "no items (0 kg)";
            } else {
            return list.size() + " items (" + this.totalWeight() + " kg)";
            }
        }
}
