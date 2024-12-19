public class Main {

    public static void main(String[] args) {
//        List<Card> cards = new ArrayList<>(52);
//        cardInsertion(cards,Card.SUIT.Spade);
//        cardInsertion(cards,Card.SUIT.Heart);
//        cardInsertion(cards,Card.SUIT.Diamond);
//        cardInsertion(cards,Card.SUIT.Club);
//        cards.forEach(System.out::print);

        Box<String> stringBox = new Box();
        stringBox.setContent("Hello");
        stringBox.getContent();

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);























//        List<String> list = new ArrayList<>();
//        String[] values={"Abhay","Shidne","sid","nammu"};
//        list.addAll(Arrays.asList(values));
//        list.forEach(s->System.out.println(s));
//        list.add("baba");
//        list.addAll(Arrays.asList("snaket","sayali"));
//        System.out.println(list);
//        System.out.print(list.contains("Abhay"));
//        list.removeIf(s->s.charAt(0)=='A');
//        System.out.println(list);
//        list.sort(Comparator.naturalOrder());


    }
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
//    public static void cardInsertion(List<Card> cards, Card.SUIT suit)
//    {
//        String faceValue;
//        for (int i = 1; i < 14; i++) {
//            faceValue=String.valueOf(i+1);
//            if (i==10) faceValue="J";
//            if (i==11) faceValue="Q";
//            if (i==12) faceValue="K";
//            if (i==13) faceValue="A";
//            cards.add(new Card( faceValue,i-1, suit));
//        }
//
//    }
}
