import java.util.ArrayList;

public class Borrower
{
  private static ArrayList<Book> borrowedBooks;

  public Borrower() {
    this.borrowedBooks = new ArrayList<>();
  }

  public void addBookToCollection(Library lib) {
    Book book = lib.checkOutBook();
    this.borrowedBooks.add(book);
  }

  public int borrowedBookCount() {
    return this.borrowedBooks.size();
  }
}
