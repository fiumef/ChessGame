public class Pawn extends Piece {

    public Pawn(boolean isWhite, int xPosition, int yPosition){
        super(isWhite,xPosition,yPosition);
    }

    private void move(){
        setyPosition(getyPosition()+1);

    }

}
