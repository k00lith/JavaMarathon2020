package day17;

public class ChessBoard {

    private ChessPiece[][] chess;

    public ChessBoard(ChessPiece[][] chess){
        this.chess = chess;
    }
    public void print(){
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j].getName());
            }
            System.out.println();
        }
    }
}
