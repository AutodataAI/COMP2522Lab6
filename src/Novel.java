/**
 * A Novel class with private instance variables
 * “title”, “author name”, and “year published”.
 *
 * @author Ted, Nick, Mohammad
 * @version 1.0
 * */



public class Novel {


    private final static int EARLIEST_PUBLISH_YEAR=0;

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructor of Novel Object.
     * @param title novel title
     * @param authorName name of author
     * @param yearPublished Novel published year*/
    public Novel(String title, String authorName, int yearPublished)
    {
        validateParameter(title, authorName, yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;

        private void validateTitle(final String title,
                                   final String authorName,
                                   final int yearPublished)
        {
            if (title == null ||
                    title.isBlank()||
                    authorName == null ||
                    authorName.isBlank()||
                    yearPublished < EARLIEST_PUBLISH_YEAR ||
                    yearPublished == null||
                    yearPublished.isBlank())

                throw new IllegalArgumentException(
                        "Parameter cannot be null, " +
                        "blank or publish year must " +
                         "be a positive integar.");
        }

    }

    /**
     * Getter of title.
     * @return String title name.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter of author name.
     * @return String author name.
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Getter of pushlised year.
     * @return int published year.
     */
    public int getYearPublished() {
        return yearPublished;
    }
}
