package pokerEnum;

public enum eSuit {
	hearts(1), diamonds(2), spades(3), clubs(4);
	private int suitValue;
	
	private eSuit(int suitValue){
		this.suitValue = suitValue;
	}

	public int getSuitValue() {
		return suitValue;
	}

}
