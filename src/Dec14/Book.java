package Dec14;

public class Book {
    public static void main(String[] args) {

        Book book = new Book();
        book.displayDetails("abcd", "xyz", 20, "SKU:1004G");
    }

    String title;
    String author;
    double price;
    String barcode;

    public Book() {
    }

    public Book(String title, String author, double price, String barcode) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.barcode = barcode;
    }

    public void displayDetails(String title, String author, double price, String barcode) {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(barcode);
    }
}
