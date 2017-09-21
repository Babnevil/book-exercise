/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Matthew Schilling)
 * @version (09.20.2017)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    //method for #2.83
    public String getAuthor()
    {
        return author;
    }
    //method for #2.83
    public String getTitle()
    {
        return title;
    }
}
