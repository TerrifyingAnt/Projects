public class Main
{
    public static void main(String[] args)
    {
        MovablePoint First = new MovablePoint(0, 0, 5, 3);
        First.moveRight();
        MovableCircle Circle = new MovableCircle(-1, 5, 1, 2, 3);
        Circle.moveLeft();
        Circle.moveRight();
        MovablePoint Second = First.copy();
        Second.moveLeft();
        MovableCircle SecondCircle = Circle.copy();
        SecondCircle.moveDown();
        System.out.println(Circle);
        System.out.println(SecondCircle);
        System.out.println(First);
        System.out.println(Second);
    }
}