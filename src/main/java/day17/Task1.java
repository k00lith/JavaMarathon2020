package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawn = ChessPiece.PAWN_WHITE;
        ChessPiece rook = ChessPiece.ROOK_BLACK;

        String[] array = {pawn.getName(),pawn.getName(),
                          pawn.getName(),pawn.getName(),
                          rook.getName(),rook.getName(),
                          rook.getName(),rook.getName()};

        for (String names : array) {
            System.out.print(names + " ");
        }

    }
}