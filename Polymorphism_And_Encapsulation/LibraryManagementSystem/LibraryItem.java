public abstract class LibraryItem {
    private final String itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        setTitle(title);
        setAuthor(author);
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Invalid title");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) throw new IllegalArgumentException("Invalid author");
        this.author = author;
    }

    protected void setBorrower(String borrower) {
        if (borrower == null || borrower.isEmpty()) throw new IllegalArgumentException("Invalid borrower");
        this.borrower = borrower;
    }

    protected String getBorrower() {
        return borrower;
    }
}