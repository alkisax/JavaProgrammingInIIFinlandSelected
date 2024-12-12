public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory (String productName, double capacity, double initialBalance) {
        super (productName, capacity);
        this.history = new ChangeHistory();
        history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    // @Override
    public String history() {
        return history.toString();

    }

    @Override
    public void addToWarehouse (double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.toString());
        System.out.println("History: " + history.toString());
        double max = this.history.maxValue();
        double min = this.history.minValue();
        double avg = this.history.average();
        System.out.println("Largest amount of product: " + max );
        System.out.println("Smallest amount of product: " + min);
        System.out.println("Average: " + avg);
    }
}
