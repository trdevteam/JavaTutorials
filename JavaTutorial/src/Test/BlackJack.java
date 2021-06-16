package Test;

import java.util.*;

public class BlackJack {

	
	/*
	 * 
	 * 	
	 * */
	
	public enum Suit{
		
		Heart,
		Spade,
		Club,
		Diamond		
		
	}
	
	public class Card {
		public Suit suit;
		public int value;		
		public Card(Suit s,int value) {
			this.suit = s;
			this.value = value;
		}
	}
	
	public class Deck{
		
		List<Card> cards = new ArrayList<Card>();
		
		public Deck() {
			for(int i=1;i<=13;i++) {
				for(Suit suit : Suit.values()) {
					this.cards.add(new Card(suit,i));
				}
			}
		}
		
		public void shuffle(List<Card> card) {};
		
	}
	
	public class Hand{
		
		List<Card> hand;
		
		public int getScore() {
			int score = 0;
			for(Card c : hand) {
				score+=c.value;
			}
			return score;
		}
		
	} 
	
	public class BlackJackCard extends Card{

		int gameValue;
		
		public BlackJackCard(Suit s, int value) {
			super(s, value);
			this.gameValue = super.value;
			if(value>10) {
				this.gameValue = 10;
			}
			
		}
		
		public int getGameValue() {
			return gameValue;
		}
		
	}
	
	public class BlackJackHand{
		
		List<BlackJackCard> hand;
		
		public int getScore() {
			int score = 0;
			for(Card c : hand) {
				score+=c.value;
			}
			return score;
		}
		
	} 
	
}
