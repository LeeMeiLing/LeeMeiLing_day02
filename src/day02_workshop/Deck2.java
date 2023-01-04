package day02_workshop;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck2 {
    
    private List<Card2> deck;


    public Deck2() {
        this.deck = new LinkedList<>();
        for (int i =0; i < Constant.SUIT.length; i++) {
            String suit = Constant.SUIT[i];

            for (int j =0; j < Constant.VALUE.length; j++) {
                Integer value = Constant.VALUE[j];
                String name = Constant.NAMES[j];
                Card2 card = new Card2 (suit,value,name);
                deck.add(card);
            }
        }
        System.out.println(deck);
    }


    public void shuffle() {

        Random rand = new SecureRandom();

        for(int curr = 0; curr < deck.size(); curr++) {
            int toSwap = rand.nextInt(deck.size());
            Card2 c = deck.get(curr);
            Card2 d = deck.get(toSwap);
            deck.set(curr,d);
            deck.set(toSwap,c);
            
        }

    }


    @Override
    public String toString() {
        return "Deck2 [deck=" + deck + "]";
    }

    
}
