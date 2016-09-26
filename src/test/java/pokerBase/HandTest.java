package pokerBase;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pokerEnum.eSuit;
import pokerEnum.eRank;
import pokerEnum.eCardNbr;
import pokerEnum.eHandStrength;


public class HandTest {
	private Deck deck;
	private static Hand handTenJack;
	private static Hand handJackQueen;
	public HandTest(){
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Deck deck = new Deck();
		handTenJack = new Hand();
		handTenJack.add(new Card(10,eSuit.hearts));
		handTenJack.add(new Card(11,eSuit.hearts));
		handTenJack.add(new Card(12,eSuit.hearts));
		handTenJack.add(new Card(13,eSuit.hearts));
		handTenJack.add(new Card(14,eSuit.hearts));
		
		handJackQueen = new Hand();
		handJackQueen.add(new Card(6,eSuit.clubs));
		handJackQueen.add(new Card(6,eSuit.spades));
		handJackQueen.add(new Card(6,eSuit.diamonds));
		handJackQueen.add(new Card(3,eSuit.hearts));
		handJackQueen.add(new Card(6,eSuit.hearts));
	
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestRoyalFlush() {	
		
		
		
	}

	@Test
	public void TestFourOfAKind() {	
	}

	@Test
	public void TestStraightFlush() {	
	}
	
}
