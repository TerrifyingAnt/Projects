import Ball.Ball;
public class TestBall {
    public static void main(String[] args) {
        Ball one = new Ball(1, 1);
        one.output();

        Ball two = new Ball(2,2);
        two.setY(13);
        two.output();

        Ball three = new Ball(3,3);
        three.setXY(4,4);
        three.output();

        Ball four = new Ball(5, 5);
        four.move(6,6);
        four.output();
    }
}
