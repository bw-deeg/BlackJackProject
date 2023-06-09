package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		
		for (Suit suit : suits) {   // 4 suits
			for (Rank rank: ranks) {    // 13 ranks 
				Card aCard = new Card(suit, rank );
				deck.add(aCard);
			}
		}   // 4 * 13 = 52 cards
	}
	
	public int checkDeckSize() {
		return deck.size();
	}
	
	public Card dealCard() {
		Card aCard = null;
	// remove a Card from the Deck
		aCard = deck.remove(0);
		return aCard;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
}
