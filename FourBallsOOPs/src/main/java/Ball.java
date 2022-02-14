
public class Ball{
    private int centerX;
    private int centerY;
    private int diameter;
    private int ballNo;

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getBallNo() {
        return ballNo;
    }

    public Ball(int centerX, int centerY, int diameter, int ballNo){
        this.centerX=centerX;
        this.centerY=centerY*ballNo/5;
        this.diameter=diameter;
        this.ballNo=ballNo;
    }

    public void incrementXPosition(){
        centerX+=ballNo;
    }
}
