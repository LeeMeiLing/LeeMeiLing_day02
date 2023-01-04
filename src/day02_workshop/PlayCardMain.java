package day02_workshop;

public class PlayCardMain {
    
    public static void main(String[] args) {
        
        // DeckOfCards c = new DeckOfCards();
        // c.shuffle();
        
        Deck2 deck = new Deck2();
        System.out.printf("before shuffling: %s \n",deck);

        deck.shuffle();
        System.out.printf("after shuffling: %s \n",deck);

    }

}
