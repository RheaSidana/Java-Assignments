import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 950;
    public static final int DIAMETER = 30;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        //ellipse 1
        ellipse(x1,HEIGHT/5, DIAMETER,DIAMETER);
        x1++;

        //ellipse 2
        ellipse(x2,HEIGHT*2/5, DIAMETER,DIAMETER);
        x2+=2;

        //ellipse 3
        ellipse(x3,HEIGHT*3/5, DIAMETER,DIAMETER);
        x3+=3;

        //ellipse 4
        ellipse(x4,HEIGHT*4/5, DIAMETER,DIAMETER);
        x4+=4;
    }
}
