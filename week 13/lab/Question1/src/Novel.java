public class Novel extends Book{
    private int wordsPerPage;

    public Novel(String bookName, String author, int shelfNo, int pageNumber, int wordsPerPage){
        super(bookName, author, shelfNo, pageNumber);
        this.wordsPerPage = wordsPerPage;
    }

    public int getWordsPerPage() {
        return wordsPerPage;
    }
    public int calculateWordsNumber(){
        return wordsPerPage * getPageNumber();
    }
}
