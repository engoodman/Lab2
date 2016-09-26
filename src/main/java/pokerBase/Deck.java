package pokerBase;

import java.util.ArrayList;
import java.util.Comparator;

import pokerEnum.eRank;
import pokerEnum.eSuit;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				deck.add(new Card(0, rank, suit));

			}
		}

	}
	public void shuffle(){ 
		for (int i = deck.size() -1; i > 0; i--){
			int index = (int)(Math.random() * deck.size());
			Card tmpCard = deck.get(index);
			deck.set(index, deck.get(i));
			tmpCard = deck.get(i);
		}	
	}
	public Card draw(){
		return deck.remove(0); 
	}

}
