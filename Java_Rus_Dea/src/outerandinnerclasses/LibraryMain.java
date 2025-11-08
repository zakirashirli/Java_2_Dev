package outerandinnerclasses;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.showContent();
    }
}

class Library {

    String book1 = "dsfhgdafha";

    void showContent() {
        Book book = new Book();
        book.showBooks();
    }

    class Book {
        void showBooks() {
            System.out.println("Это книга про: " + book1);
        }
    }
}
