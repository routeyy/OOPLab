package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

  private List<Card> cards = new ArrayList<Card>();
  private List<String> cardNames = new ArrayList<String>();
  private List<String> cardSuits = new ArrayList<String>();
  
  private List<String> cName() {
    cardNames.add(0, "Two");
    cardNames.add(1, "Three");
    cardNames.add(2, "Four");
    cardNames.add(3, "Five");
    cardNames.add(4, "Six");
    cardNames.add(5, "Seven");
    cardNames.add(6, "Eight");
    cardNames.add(7, "Nine");
    cardNames.add(8, "Ten");
    cardNames.add(9, "Jack");
    cardNames.add(10, "Queen");
    cardNames.add(11, "King");
    cardNames.add(12, "Ace");
    return cardNames;
  }
  
  private List<String> cSuit() {
    cardSuits.add(0, "Clubs");
    cardSuits.add(1, "Diamonds");
    cardSuits.add(2, "Hearts");
    cardSuits.add(3, "Spades");
    return cardSuits;
  }

  public Deck() {
    cName();
    cSuit();
    
    int cNameCounter = 0;
    int cSuitCounter = 0;
    int cValue = 2;
    
    for(int i = 0; i < 52 && cNameCounter < 13 && cSuitCounter < 4 && cValue < 15; i++) {
      Card genericCard = new Card(cardNames.get(cNameCounter), cardSuits.get(cSuitCounter), cValue);
      cNameCounter++;
      cSuitCounter++;
      cValue++;
      if(cNameCounter > 12) {
        cNameCounter = 0;
      }
      if(cSuitCounter > 3) {
       cSuitCounter = 0;
      }
      if(cValue > 14) {
        cValue = 2;
      }
      cards.add(genericCard);
    }
  }
  
  public void shuffle() {
    Collections.shuffle(cards);
  }
  
  public Card draw() {
    Card card = cards.remove(0);
    return card;
  }
  
  public void describe() {
    for(Card card : cards) {
      card.describe();
    }
  }
  
  
}
