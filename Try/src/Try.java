import processing.core.PApplet;

public class Try extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 350;
    public static final int DIAMETER = 20;
    int x1 = 0;
    int y1= 10;
    int x2=0;
    int y2 = 110;
    int x3=0;
    int y3=210;
    int x4=0;
    int y4=310;

    public static void main(String[] args) {
        PApplet.main("Try", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        //ellipse(100,200,300,400);
    }

    @Override
    public void draw() {
        //super.draw();
        //background();
        ellipse();

    }

    private void ellipse() {
        ellipse(x1,y1,DIAMETER,DIAMETER);
        ellipse(x2,y2,DIAMETER,DIAMETER);
        ellipse(x3,y3,DIAMETER,DIAMETER);
        ellipse(x4,y4,DIAMETER,DIAMETER);
        x1++;
        x2+=2;
        x3+=3;
        x4+=4;

    }

    private void background() {
        background(255);
    }
}
