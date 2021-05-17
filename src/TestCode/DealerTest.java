package TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Model.*;
import View.UNOCard;

import org.mockito.BDDMockito.Then;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class DealerTest {
	Dealer d;
	

	@Before
	public void setUp() throws Exception {
	
		d=new Dealer();

	}

	@Test
	public void shuffleTest() {
		
		assertEquals(108,d.shuffle().size());
	}
	
	/*@Test
	public void spreadOutTest() {
		UNOCard c=Mockito.mock(UNOCard.class);
		Player p1=Mockito.mock(Player.class);
		Player p2=Mockito.mock(Player.class);
		Mockito.doNothing().when(p1).obtainCard(c);
		Mockito.doNothing().when(p1).obtainCard(c);
		Player[] p= {p1,p2};
		d.shuffle();
		d.spreadOut(p);
	}*/
	
	@Test
	public void getCardTest() {
	
		d.shuffle();
		UNOCard c=d.getCard();
		
		assertNotNull(c);
	}
	

}
