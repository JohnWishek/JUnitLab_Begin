package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class GiftCardTest {

	@Test
	public void testGetIssuingStore() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	@Test
	public void getBalance() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), .0001);
	}
	@Test
	public void deduct_RemainingBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		double amount;
		
		amount = 100;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		String      result;
	        
	        if (amount < 0.0)
	        {
	            result = "Invalid Transaction";
	        }
	        else
	        {
	            balance -= amount;
	            
	            if (balance < 0.0)
	            {
	                result = "Amount Due: " + String.format("%6.2f",
	                                                        Math.abs(balance));
	                balance = 0.0;
	            }
	            else
	            {
	                result = "Remaining Balance: " + String.format("%6.2f",
	                                                         Math.abs(balance));
	            }
	        }
		assertEquals("deduct()", result, card.deduct(amount));
	}
}
