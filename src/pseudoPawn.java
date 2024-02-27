import java.util.HashMap;

public class pseudoPawn {
    private boolean isBlack;
    private boolean isWhite;
    private int xPosition;
    private int yPosition;


    public pseudoPawn(boolean isBlack, boolean isWhite, int xPosition, int yPosition){
        this.isBlack = isBlack;
        this.isWhite = isWhite;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
