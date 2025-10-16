package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> listPiece = new ArrayList<>();
        Collections.addAll(listPiece,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK);

        for (ChessPiece c:listPiece){
            System.out.print(c.getNotationFigure()+" ");
        }
    }
}