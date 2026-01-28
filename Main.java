public class Main {
  public static void main(String[] args) {
    Deck pokerDeck = new Deck();

    pokerDeck.shuffle();
    System.out.println("Head");
    pokerDeck.head();
    System.out.println("Pick");
    pokerDeck.pick();
    System.out.println("Hand");
    pokerDeck.hand();
  }
}