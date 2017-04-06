package Zad6;

import java.util.ArrayList;


public class Library {
    /*
	 * zad6
	 * Stwórz klasę Book, która będzie zawierała informację o książce. Stwórz
	 * przykładowe książki (stworzenie książki w klasie Library).
	 */
    public static void main(String[] args) {


        ArrayList<Book> books=new ArrayList<Book>();
        books.add(new Book("W pustyni i w puszczy", "H.Sienkiewicz", 350));
        books.add(new Book("Harry Potter", "J.K.Rawling", 800));

        for(Book b:books){
            System.out.println(b.getAuthor()+" "+b.getTitle()+" "+b.getNumberOfPages());
            System.out.println(b.toString());

        }
    }

}
