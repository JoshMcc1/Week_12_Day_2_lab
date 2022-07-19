import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest
{
  private Library lib;
  private Book book;

  @Before
  public void before() {
  lib = new Library(5);
  book = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy");
  }

  @Test
  public void canAddBook() {
    lib.addBook(book);
    assertEquals(1, lib.bookCount());
  }

  @Test
  public void libraryHitCapacity() {
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    assertEquals(5, lib.bookCount());
  }

  @Test
  public void canFillGenresWhenAddingBook() {
    lib.addBook(book);
    assertEquals(1, lib.getGenreMapCount());
  }

  @Test
  public void canIncreaseCountInGenresWhenAddingMoreBooks() {
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    lib.addBook(book);
    assertEquals(4, lib.getValueCountByGenre(book.getGenre()));
  }
}
