package src;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = true;
    }

    public int addToner(int tonerAmount) {
       int tempAmount = tonerAmount + tonerLevel;
       if(tempAmount > 100 || tempAmount < 0) {
           return -1;

       }
        tonerLevel += tonerAmount;
       return tonerLevel;
    }

    public int printPages(int pagesToBePrinted) {
        int jobPages = (duplex) ? (pagesToBePrinted / 2) + (pagesToBePrinted % 2) : pagesToBePrinted;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial pages account = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(15);
        System.out.printf("current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());





    }
}
