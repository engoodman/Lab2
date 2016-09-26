package pokerBase;

import java.util.ArrayList;



import java.util.Comparator;

import pokerEnum.eCardNbr;
import pokerEnum.eRank;
import pokerEnum.eSuit;
import pokerEnum.eHandStrength;



import java.util.Collections;

public class Hand{
	private ArrayList<Card> hand = new ArrayList<Card>();
	public void addCard(Deck deck){
		hand.add(deck.draw());
	}
	private ArrayList<Card> CardsInHand;
	
	private ArrayList<Card> getCardsInHand(){
		return CardsInHand;
	}

public void sortByRank(){
	Collections.sort(hand, new Comparator<Card>(){
		@Override
		public int compare(Card o1, Card o2){
			return o2.getCardRank().getRankValue()-o1.getCardRank().getRankValue();
			
		}
		
	});
}
public Comparator<Card>NumRank = new Comparator<Card>(){
	@Override
	public int compare(Card o1,Card o2){
		return o2.getCardRank().getRankValue()-o1.getCardRank().getRankValue();
		
	}
}; 

	

public void sortBySuit(){
	Collections.sort(hand, new Comparator<Card>(){
		@Override
		public int compare(Card o1,Card o2){
			return o2.getCardSuit().getSuitValue()-o1.getCardSuit().getSuitValue();
			
		}
	});
}
private static boolean isFlush(ArrayList<Card> cards){
	boolean bIsFlush = false;
	for(int i = cards.size() -1; i > 0; i--){
		if (cards.get(i).getCardSuit().getSuitValue() != cards.get(i).getCardSuit().getSuitValue());
			return true;
	}
	return bIsFlush;
}
private static boolean isStraight(ArrayList<Card> cards, Card highCard){
	boolean bIsStraight = true;
	for (int i = cards.size() -1; i > 0; i--){
		if (cards.get(i).getCardRank().getiRankNbr() +1 != cards.get(i).getCardRank().getiRankNbr());
			return false;
		
	}
	highCard = cards.get(eCardNbr.fifth.getCardNbr());
	return bIsStraight;
}
public static boolean isRoyalFlush(Hand H, HandScore HS){ //Different combinations 
	boolean isRoyalFlush = false;
	Card highCard = null;
	if (isFlush(H.getCardsInHand())&&isStraight(H.getCardsInHand(), highCard) && highCard.getCardRank()==eRank.ace){
		isRoyalFlush = true;
	}
	return isRoyalFlush;
	
}
public static boolean isStraightFlush(Hand H, HandScore HS){
	boolean isStraightFlush = false;
	Card highCard = null;
	if (isFlush(H.getCardsInHand())&&isStraight(H.getCardsInHand(), highCard)){
		isStraightFlush = true;
	}
	return isStraightFlush;
}
public static boolean isFourOfAKind(Hand H, HandScore HS){ //Different combinations
	boolean checkHand = false;
	if(H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()){
		checkHand = true;
		HS.setHandStrength(eHandStrength.isFourOfAKind.getHandStrength());
		HS.setHiHand(H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank().getiRankNbr());
		HS.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()));
		HS.setKickers(kickers);
		
	}else if (H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
		checkHand = true;
		HS.setHandStrength(eHandStrength.isFourOfAKind.getHandStrength());
		HS.setHiHand(H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank().getiRankNbr());
		HS.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(H.getCardsInHand().get(eCardNbr.first.getCardNbr()));
		HS.setKickers(kickers);
		
	}
	return checkHand;
}
public static boolean isFullHouse(Hand H, HandScore HS){
	boolean isFullHouse = false;
	if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()
		&& H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
		isFullHouse = true;
		HS.setHandStrength(eHandStrength.isFullHouse.getHandStrength());
	}
	return isFullHouse;
}
public static boolean isFlush(Hand H, HandScore HS){
	boolean isFlush = false;
	isFlush = isFlush(H.CardsInHand);
	if (isFlush == isFlush);
	return true;
}
public static boolean isStraight(Hand H, HandScore HS){
	boolean isStraight = false;
		isStraight = isStraight(H.CardsInHand, new Card(0,eRank.ace,eSuit.clubs));
		if (isStraight == isStraight);
		return true;
}
public static boolean isThreeOfAKind(Hand H, HandScore HS){
	boolean checkHand = false;
	if(H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()){
		checkHand = true;
		HS.setHandStrength(eHandStrength.isThreeOfAKind.getHandStrength());
		HS.setHiHand(H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank().getiRankNbr());
		HS.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(H.getCardsInHand().get(eCardNbr.third.getCardNbr()));
		HS.setKickers(kickers);
	} else if (H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
		checkHand = true;
		HS.setHandStrength(eHandStrength.isThreeOfAKind.getHandStrength());
		HS.setHiHand(H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank().getiRankNbr());
		HS.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(H.getCardsInHand().get(eCardNbr.first.getCardNbr()));
		HS.setKickers(kickers);
	
	}else if(H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()){
		checkHand = true;
		HS.setHandStrength(eHandStrength.isThreeOfAKind.getHandStrength());
		HS.setHiHand(H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank().getiRankNbr());
		HS.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(H.getCardsInHand().get(eCardNbr.first.getCardNbr()));
		HS.setKickers(kickers);
	}
	return checkHand;
	
	
}
public static boolean isTwoPair(Hand H, HandScore HS){
	boolean isTwoPair = false; 
	if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank() 
			&& H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isTwoPair.getHandStrength());
		isTwoPair = true;
	}else if (H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank() 
				 && H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
			  HS.setHandStrength(eHandStrength.isTwoPair.getHandStrength());
			  isTwoPair = true;
		}
	
	return isTwoPair;
}
public static boolean isPair(Hand H, HandScore HS){
	boolean isPair = false;
	if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isPair.getHandStrength());
		isPair = true;
	}
	else if (H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isPair.getHandStrength());
		isPair = true;
	}
	else if (H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()==H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isPair.getHandStrength());
		isPair = true;
	}else if (H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank() == H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isPair.getHandStrength());
		isPair = true;
	}
	return isPair;
}
public static boolean isHighCard(Hand H, HandScore HS){
	boolean isHighCard = false;
	if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() != H.getCardsInHand().get(eCardNbr.second.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isHighCard.getHandStrength());
		isHighCard = true;
	}else if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() != H.getCardsInHand().get(eCardNbr.third.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isHighCard.getHandStrength());
		isHighCard = true;
	}else if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() != H.getCardsInHand().get(eCardNbr.fourth.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isHighCard.getHandStrength());
		isHighCard = true;
	}else if (H.getCardsInHand().get(eCardNbr.first.getCardNbr()).getCardRank() != H.getCardsInHand().get(eCardNbr.fifth.getCardNbr()).getCardRank()){
		HS.setHandStrength(eHandStrength.isHighCard.getHandStrength());
		isHighCard = true;
	}
	return isHighCard;
}
}
	



 
