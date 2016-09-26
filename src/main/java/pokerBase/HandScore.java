package pokerBase;

import java.util.ArrayList;


import javax.xml.bind.annotation.XmlElement;

public class HandScore {
	private int HandStrength;
	private int HiHand;
	private int LoHand = 0;
	private ArrayList<Card> Kickers = new ArrayList<Card>();
	private boolean Natural = true;
	
	public HandScore(){}
	
	public HandScore(int handStrength, int hiHand, int loHand, ArrayList<Card> kickers){
		super();
		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
		Kickers = kickers;



	
}

	public void setHandStrength(int handStrength) {
		HandStrength = handStrength;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public void setKickers(ArrayList<Card> kickers) {
		Kickers = kickers;
	}

	public void setNatural(boolean natural) {
		Natural = natural;
	}

	public int getHandStrength() {
		return HandStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public ArrayList<Card> getKickers() {
		return Kickers;
	}

	public boolean isNatural() {
		return Natural;
	}


	}
