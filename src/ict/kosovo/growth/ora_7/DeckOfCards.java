package ict.kosovo.growth.ora_7;

public class DeckOfCards {
    public static void main(String[] args) {
        String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] suit = {":clubs:", ":diamonds:", ":hearts:", ":spades:"};
        String [] deck = new String[52];

        for (int j = 0; j < suit.length; j++){
            for (int i = 0; i < deck.length; i++){
                deck[i + 13 * j] = rank[i] + suit[j];
            }
            for (int i = 0; i < deck.length; i ++)
                System.out.println(deck[i] + " ");
        }
        System.out.println();
    }
}
