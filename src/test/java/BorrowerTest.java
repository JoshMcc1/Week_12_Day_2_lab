import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest
{
  private static Borrower borrower;
  private static Library lib;
  private static Book book;

  @Before
  public void before() {
    borrower = new Borrower();
    lib = new Library(5);
    book = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy");
    lib.addBook(book);
  }

  @Test
  public void canAddBookToCollection() {
    borrower.addBookToCollection(lib);
    assertEquals(1, borrower.borrowedBookCount());
  }
}
