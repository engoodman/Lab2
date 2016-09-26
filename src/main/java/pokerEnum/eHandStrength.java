package pokerEnum;

public enum eHandStrength {
	isRoyalFlush(110), isStraightFlush(90),isFourOfAKind(80),isFullHouse(70),isFlush(60),isStraight(50),isThreeOfAKind(40),isTwoPair(30),isPair(20),isHighCard(10);
	private int handStrength;
	
	private eHandStrength(int handStrength){
		this.handStrength = handStrength;
		
	}
	public int getHandStrength(){
		return handStrength; 
	}
}
