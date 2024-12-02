package com.chess.engine.board;
import com.chess.engine.Alliance;
import com.chess.engine.pieces.Piece;
public class Board {
    private final Listt<Title> gameBoard;
private Board(Builder builder){
    this.gameBoard = createGameBoard(builder);
}
    public Tile getTile(int tileCoordinate) {
    return null;
    }
private static List<Title> createGameBoard(final Builder builder){
 final Title[] tiles =new Title [BoardUtils.NUM_TILES]:
     for(int i=0;i<BoardUtils.NUM_TILES;i++){
     tiles[i] = Tile.craeteTile(i,builder.boardConfig.get(i));
     }
    return ImmtableList.copyOf(tiles);
}
public static Board createStandardBoard(){
    
}
    
 public static Builder {
 Map<Integer, Piece> boardconfig;
 Alliance nextMoveMaker;
     public Builder(){
     }
         public Builer setPiece(final Piece piece){
         this. boardconfig.put(piece.getPi)
         return this;    
         }
    public Builder setMoveMaker(final Alliance nextMoveMaker){
     this.nextMoveMaker = nextMoveMaker;
        return this;
        
    }
     public Board build(){
         return new Board(this);
     }
 }




}

