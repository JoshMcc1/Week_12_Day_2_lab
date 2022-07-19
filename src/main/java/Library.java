import java.util.ArrayList;
import java.util.HashMap;

public class Library
{
  private static ArrayList<Book> books;
  private static int capacity;

  private static HashMap<String, Integer> genres;

  public Library(int capacity) {
    this.books = new ArrayList<>();
    this.capacity = capacity;
    this.genres = new HashMap<>();
  }

  public int bookCount() {
    return this.books.size();
  }

  public void addBook(Book book) {
    if (bookCount() < this.capacity)
    {
      this.books.add(book);
      if (!this.genres.containsKey(book.getGenre())) {
        this.genres.put(book.getGenre(), 1);
      }
      else {
        this.genres.put(book.getGenre(), genres.get(book.getGenre()) + 1);
      }
    }

  }

  public Book checkOutBook() {
    return this.books.remove(0);
  }

  public int getGenreMapCount() {
    return this.genres.size();
  }

  public int getValueCountByGenre(String genre) {
    return this.genres.get(genre);
  }
}
