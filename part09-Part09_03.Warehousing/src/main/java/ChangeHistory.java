import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list = new ArrayList<>();
    }

    public double maxValue(){
        double max = Double.MIN_VALUE;
        for (double status: list) {
            if (status > max) {
                max = status;
            }
        }
        return max;
    }

    public double minValue(){
        double min = Double.MAX_VALUE;
        for (double status: list) {
            if (status < min) {
                min = status;
            }
        }
        return min;
    }

    public double average() {
        if (list.size() == 0) {
            return 0.0;
        }
        double sum = 0;
        int i = 0;
        for (Double status: list) {
            sum += status;
            i++;
        }
        double avg = (double) sum / i;
        return avg;
    }

    public String toString(){
        String output = "[";
        for (int i = 0; i < list.size(); i++){
            output += list.get(i);
            if (i < list.size() - 1) {
                output += ", ";
            }
        }
        output += "]";
        return output;
    }
}
