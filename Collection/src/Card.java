//public class Card {
//
//    public enum SUIT{
//        Club('\u2663'),      // ♣
//        Diamond('\u2666'),   // ♦
//        Heart('\u2665'),     // ♥
//        Spade('\u2660');     // ♠
//        private final char symbol;
//
//        public char getSymbol() {
//            return symbol;
//        }
//
//        SUIT(char symbol) {
//            this.symbol = symbol;
//
//
//        }
//    }
//    private String facefield;
//    private SUIT suit;
//    private int rank;
//    public Card(String facefield,int rank,SUIT suit) {
//        this.facefield = facefield;
//        this.rank=rank;
//        this.suit=suit;
//    }
//
//    public SUIT getSuit() {
//        return suit;
//    }
//
//    public int getRank() {
//        return rank;
//    }
//
//    public String getFacefield() {
//        return facefield;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s%s(%d)", facefield, getSuit().getSymbol(), rank);
//    }
//    public static Card getNumericCard(SUIT suit,int rank)
//    {
////    return new Card();
//
//    }}
