import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;
    private Random random;

    public Deck() {
        deck = new ArrayList<>();
        random = new Random();
        inicializarDeck();
    }

    private void inicializarDeck() {
        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? "Rojo" : "Negro";
            for (String valor : valores) {
                deck.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("se mezcló el Deck.");
    }

    public void head() {
        if (deck.isEmpty()) return;

        Card carta = deck.remove(0);
        System.out.println(carta);
        System.out.println("quedan " + deck.size() + " cartas en el deck");
    }

    public void pick() {
        if (deck.isEmpty()) return;

        int index = random.nextInt(deck.size());
        Card carta = deck.remove(index);
        System.out.println(carta);
        System.out.println("quedan " + deck.size() + " cartas en el deck");
    }

    public Card[] hand() {
        if (deck.size() < 5) return null;

        Card[] mano = new Card[5];
        for (int i = 0; i < 5; i++) {
            mano[i] = deck.remove(0);
            System.out.println(mano[i]);
        }
        System.out.println("quedan " + deck.size() + " cartas en el deck");
        return mano;
    }
}
