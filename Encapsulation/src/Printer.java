public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    final private static int maxTonerLevel=100;
    final private static int minTonerLevel=0;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount)
    {   if (tonerAmount>0) {
        tonerLevel = tonerLevel + tonerAmount;
        if (tonerLevel > maxTonerLevel) {
            tonerLevel = maxTonerLevel;

        }
        return tonerLevel;
    }
    else return -1;
    }
    public void printPages(int pages)
    {
        if((duplex && tonerLevel>=pages*2))
        {
                pagesPrinted=pages*2;
                System.out.printf("Duplex Printing\n"+pages+" are printed\n New toner level is: %d\n",tonerLevel=tonerLevel-pages*2);
        }
        if (tonerLevel>=pages)
        {
            pagesPrinted=pages;
            System.out.printf("Normal Printing\n"+pages+" are printed\n New toner level is: %d\n",tonerLevel=tonerLevel-pages);
        }
        else System.out.println("TonerLevel is low, requested page to br printed:"+pages+"\n Toner level:"+tonerLevel);
    }

}
