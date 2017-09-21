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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    //method for #2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
    //method for #2.84
    public void printTitle()
    {
        System.out.println(title);
    }
    // method for #2.85
    public int getPages()
    {
        return pages;
    }
    //method for #2.87, appended for #2.89
    public void printDetails()
    {
        System.out.println("Author:.......... " + author 
        + "\nTitle:........... " + title + "\nPages:........... " + pages);

        if (refNumber.length() != 0)
            System.out.println("Reference Number: " + refNumber);
        else System.out.println("Reference Number: ZZZ");
    }
    //method for #2.88
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    //disposable accessor to check value of refNumber
    public String getRefNumber()
    {
        return refNumber;
    }
}
