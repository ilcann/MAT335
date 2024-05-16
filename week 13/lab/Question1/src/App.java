public class App {
    public static void main(String[] args) throws Exception {
        Novel novel1 = new Novel("The Hobbit", "J.R. Tolkien", 1212, 1234, 300);
        System.out.printf("Book Name: %s\n Author: %s\n shelf: %d\n Page Count: %d\n WordsPerPage: %d\n WordsCount: %d\n", novel1.getBookName(), novel1.getAuthor(), novel1.getShelfNo(), novel1.getPageNumber(), novel1.getWordsPerPage() ,novel1.calculateWordsNumber());
        Poem poem1 = new Poem("The Hobbit's Poems", "J.R. Tolkien", 1212, 1234, 300, 400);
        System.out.printf("Book Name: %s\n Author: %s\n shelf: %d\n Page Count: %d\n WordsPerOddPage: %d\n WordsPerEvenPage: %d\n" + //
                        " WordsCount: %d\n", poem1.getBookName(), poem1.getAuthor(), poem1.getShelfNo(), poem1.getPageNumber(), poem1.getWordsPerOddPage() ,poem1.getWordsPerEvenPage() ,poem1.calculateWordsNumber());
    }
}
