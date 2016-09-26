package pokerBase;


import pokerEnum.eRank;


import pokerEnum.eSuit;
import java.util.Comparator;


public class Card {
	
	private int iCardNbr;
	private eRank cardRank;
	private eSuit cardSuit;
	public Card(int iCardNbr, eRank cardRank, eSuit cardSuit) {
		super();
		this.iCardNbr = iCardNbr;
		this.cardRank = cardRank;
		this.cardSuit = cardSuit;
	}
	public int getiCardNbr() {
		return iCardNbr;
	}
	public eRank getCardRank() {
		return cardRank;
	}
	public eSuit getCardSuit() {
		return cardSuit;
	}
	
	public static Comparator<Card> CardRank = new Comparator<Card>(){
		public int compare(Card c1, Card c2){
			int o1 = c1.getCardRank().getiRankNbr();
			int o2 = c2.getCardRank().getiRankNbr();
			return o2-o1;
		}};
		public int compareTo(Object o){
			Card c = (Card) o;
			return c.getCardRank().compareTo(this.getCardRank());
	}
	
	
	
	

	
	
	
	
	
}
