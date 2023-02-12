public class Main {
    public static void main(String[] args) {
        Book book = new Book("Горе от ума");
        Book book1 = new Book("Герой нашего времени");
        Magazine magazine = new Magazine("Vogue");
        Magazine magazine1 = new Magazine("Women");
        Printable[] printable = {book, book1, magazine, magazine1};
        for (Printable printable1: printable){
            printable1.print();
        }
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}