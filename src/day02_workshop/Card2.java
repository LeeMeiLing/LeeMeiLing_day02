package day02_workshop;

public class Card2 {
    
    private String suit;
    private Integer value;
    private String name;


    public Card2(String suit, Integer value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }


    public String getSuit() {
        return suit;
    }
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Card{name=%s, suit=%s, value=%d}".formatted(this.name, this.suit, this.value);
    }

}
