package pokerEnum;

public enum eCardNbr {
	first(1),second(2),third(3),fourth(4),fifth(5);
	private int cardNbr;
	
	private eCardNbr(int cardNbr){
		this.cardNbr = cardNbr;
		
	}
	public int getCardNbr(){
		return cardNbr; 
		
	}

}
