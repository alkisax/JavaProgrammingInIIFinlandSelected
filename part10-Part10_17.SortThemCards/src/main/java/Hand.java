import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort(){
        hand = hand.stream()
            .sorted()
            .collect(Collectors.toList());
    }

    public int handValue(){
        int handValue = 0;
        for (Card card: hand) {
            handValue += card.getValue();
        }
        return handValue;

        // return hand.stream()
        // .mapToInt(Card::getValue)  // Sum the value of each card in the hand
        // .sum();
    }

    public int compareTo(Hand otherHand) {
        if (this.handValue() > otherHand.handValue()) {
            return 1;
        } else if (this.handValue() < otherHand.handValue()){
            return -1;
        } else {
            return 0;
        }
    }
    public void sortBySuit() {
        hand = hand.stream()
        .sorted(new BySuitInValueOrder())
        .collect(Collectors.toList());
    }

}
