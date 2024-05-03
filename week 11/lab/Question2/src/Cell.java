public enum Cell {
    X("X"),
    O("O"),
    EMPTY("EMPTY");

    private final String symbol;

    Cell(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
}
