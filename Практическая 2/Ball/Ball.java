package Ball;

public class Ball {
    private double x=0.0;
    private double y=0.0;

    public Ball(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX()    {
        return x;
    }

    public double getY()    {
        return y;
    }

    public void setX(double x) {
        this.x=x;
    }

    public void setY(double y) {
        this.y=y;
    }

    public void setXY(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public void move(double movX, double movY) {
        x += movX;
        y += movY;
    }

    public void output() {
        System.out.println(getX() + " " + getY());
    }
}
