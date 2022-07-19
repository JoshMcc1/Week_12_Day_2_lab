public class Book
{
  private static String title;
  private static String author;
  private static String genre;

  public Book(String title, String author, String genre) {
    this.title = title;
    this.author = author;
    this.genre = genre;
  }

  public String getGenre() {
    return this.genre;
  }
}
