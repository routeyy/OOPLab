package week5;

public class Card {

  private String name;
  private String suit;
  private int value;
  
  public Card() {};
  
  public Card(String name, String suit, int value) {
    this.name = name;
    this.suit = suit;
    this.value = value;
  }
  
  public void describe() {
    System.out.println("Card - " + name + " of " + suit);
    System.out.println("Value - " + value + "\n");
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSuit() {
    return suit;
  }
  public void setSuit(String suit) {
    this.suit = suit;
  }
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
}
