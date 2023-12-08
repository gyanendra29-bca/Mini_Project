package com.gyanendra.test;

import com.gyanendra.test.pieces.piece;

public class Position {
    private piece piece;


    Position(piece piece ) {
        this.piece = piece;
    }

    public piece getPiece() {
        return piece;

    }

    void setPiece(piece piece) {
        this.piece = piece;
    }
}
