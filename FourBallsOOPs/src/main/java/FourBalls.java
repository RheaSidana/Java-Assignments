import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 950;
    public static final int WIDTH = 1200;
    Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initBalls();
    }

    void initBalls(){
        for (int i = 0; i < 4; i++) {
            int ballno = i+1;
            balls[i] = new Ball(0,HEIGHT,30,ballno);
            //drawBall(balls[i]);
        }
    }

    public void drawBall(Ball ball){
        ellipse(ball.getCenterX(),ball.getCenterY(),ball.getDiameter(),ball.getDiameter());
        ball.incrementXPosition();
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            drawBall(balls[i]);
        }
    }
}
