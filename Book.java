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
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = course;
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
    //method for #2.87, appended for #2.89, and for #2.91
    public void printDetails()
    {
        System.out.println("Author:.......... " + author 
        + "\nTitle:........... " + title + "\nPages:........... " + pages
        + "\nTimes Borrowed:.. " + borrowed);
        
        if (refNumber.length() != 0)
            System.out.println("Reference Number: " + refNumber);
        else System.out.println("Reference Number: ZZZ");
    }
    //method for #2.88, appended for #2.90
    public void setRefNumber(String ref)
    {
        if (ref.length() >=3)
            refNumber = ref;
        else System.out.println("Refernece number assignment failed" + 
        "\nNumber must be at least three digits");
    }
    //disposable accessor to check value of refNumber
    public String getRefNumber()
    {
        return refNumber;
    }
    //exercise 2.91, mutator method for #of times borrowed 
    public void borrow()
    {
        borrowed ++;
    }
    //exercise 2.91, accessor method for #of times borrowed
    public int getBorrowed()
    {
        return borrowed;
    }
    //exercise 2.92, accessor for course text
    public boolean isCourseText()
    {
        return courseText;
    }
}
