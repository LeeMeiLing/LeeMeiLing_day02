package day02_workshop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeckOfCards{
    
    private int totalCard = 52;
    private List<Card> cards;
    private String suit;

    public DeckOfCards() {

        for (int i = 0; i < 4; i++) {

            switch(i){
                case 0: 
                    suit = "diamond";
                    break;

                case 1: 
                    suit = "club";
                    break;

                case 2: 
                    suit = "heart";
                    break;

                case 3: 
                    suit = "spade";
                    break;
            }

            for (int j = 0; j < 13; j++){
                cards.add(new Card(j, suit));
            }
            
        }

    }

    

    public List<Card> shuffle() {

        Set<Card> shuffledCards = new HashSet<>();
        shuffledCards.addAll(this.cards);
        cards.addAll(shuffledCards);
        System.out.println(cards);

        return cards;
    }
    
    
}
