public abstract class Book {
    private String bookName;
    private String author;
    private int shelfNo;
    private int pageNumber;

    public Book() {
        this.bookName = "";
        this.author = "";
        this.shelfNo = 0;
        this.pageNumber = 0;
    }    
    public Book(String bookName, String author, int shelfNo, int pageNumber) {
        this.bookName = bookName;
        this.author = author;
        this.shelfNo = shelfNo;
        this.pageNumber = pageNumber;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public int getShelfNo() {
        return shelfNo;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public abstract int calculateWordsNumber();
}
