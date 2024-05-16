public class Poem extends Book{
    private int wordsPerOddPage;
    private int wordsPerEvenPage;

    public Poem(String bookName, String author, int shelfNo, int pageNumber, int wordsPerOddPage, int wordsPerEvenPage) {
        super(bookName, author, shelfNo, pageNumber);
        this.wordsPerOddPage = wordsPerOddPage;
        this.wordsPerEvenPage = wordsPerEvenPage;
    }

    public int calculateWordsNumber() {
        int result = 0;
        for (int i = 1; i <= getPageNumber(); i++){
            if (i%2 == 0) {
                result += wordsPerEvenPage;
            }
            else {
                result += wordsPerOddPage;
            }
        }
        return result;
    }
    public int getWordsPerEvenPage() {
        return wordsPerEvenPage;
    }
    public int getWordsPerOddPage() {
        return wordsPerOddPage;
    }
}
