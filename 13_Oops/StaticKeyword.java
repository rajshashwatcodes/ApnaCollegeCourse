class Book {
    int price;
    static int count; // common in class- no new object is created for static variables and can be directly accessed through class

    public Book(int price) { //constructor Book
        this.price = price;
        count++;
    }
}

public class StaticKeyword {
    public static void main(String args[]) {
        System.out.println(Book.count); //count before creating any Book object
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count); //count after creating two Book objects
    }
}
