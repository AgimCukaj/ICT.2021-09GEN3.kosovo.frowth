package ict.kosovo.growth.ora_6;

public class DeckOfCards{
    public static void main(String [] args){
        String [] ranks={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {":clubs:", ":diamonds:", ":hearts:", ":spades:"};
        String [] deck=new String[52];

        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                System.out.println(deck[i]=ranks[j]+suits[i]);
            }
        }
        System.out.println("============================================");
        for(int i=0;i<ranks.length;i++){
            for(int j=0;j<suits.length;j++){
                System.out.println(deck[i]=ranks[i]+suits[j]);
            }
        }
    }
}

