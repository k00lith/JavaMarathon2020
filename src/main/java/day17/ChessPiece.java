package day17;

public enum ChessPiece {
    KING_WHITE("♔", 100), KING_BLACK("♚", 100),             // Король
    QUEEN_WHITE("♕", 100), QUEEN_BLACK("♛", 100),           // Ферзь
    ROOK_WHITE("♖", 100), ROOK_BLACK("♜", 100),             // Ладья
    ELEPHANT_WHITE("♗", 100), ELEPHANT_BLACK("♝", 100),     // Слон
    HORSE_WHITE("♘", 100), HORSE_BLACK("♞", 100),           // Конь
    PAWN_WHITE("♙", 100), PAWN_BLACK("♟", 100),             // Пешка
    EMPTY("_", -1);

    private String name;
    private int price;

    ChessPiece(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

}
