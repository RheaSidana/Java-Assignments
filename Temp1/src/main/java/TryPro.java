import processing.core.PApplet;
import processing.core.PApplet.*;

public class TryPro extends PApplet {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 200;
    int x=0;
    int y=0;
    boolean metYBoundary=false;
    boolean metXBoundary=false;

    public static void main(String[] args) {
        PApplet.main("TryPro",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(WIDTH/2,HEIGHT/2,200,200);
    }

    @Override
    public void draw() {
        ellipse(x,y, DIAMETER,DIAMETER);
        handleXDirection();
        handleYDirection();

    }

    private void handleYDirection() {
        //if is even then y direction is incremented/decremented
        if(x%2==0){
            if(y<HEIGHT && metYBoundary==false){
                y+=1;
            }
            else if(y>0){
                metYBoundary=true;
                y-=1;
            }
            else if(y==0){
                metYBoundary=false;
            }
        }
    }

    private void handleXDirection() {
        if(x<WIDTH && metXBoundary==false)
            x+=1;
        else if(x>0)
        {
            metXBoundary=true;
            x-=1;
        }
        else if(x==0){
            metXBoundary=false;
        }
    }
}
