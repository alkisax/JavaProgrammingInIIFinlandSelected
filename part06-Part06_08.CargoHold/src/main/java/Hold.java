import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.list = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) <= maximumWeight) {
        list.add(suitcase);
        }
    }

    public int totalWeight () {
        int totalWeight = 0;
        for (Suitcase suitcase: list) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems () {
        if (list.size() == 0) {
            System.out.println("There are no suitcases."); 
        } else {
            System.out.println("The suitcases in the hold contain the following items:");
            for (Suitcase suitcase: list) {
                suitcase.printItems();
            }
        }
    }

    public String toString() {
        return list.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
