public class MovablePoint implements Movable
{
    int x; // х-координата
    int y; // у-координата
    int xSpeed; // скорость по оси х
    int ySpeed; // скорость по оси у

    // конструктор
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // метод движение вверх
    @Override
    public void moveUp()
    {
        y = y + ySpeed;
    }

    // метод движения вниз
    @Override
    public void moveDown()
    {
        y = y - ySpeed;
    }

    // метод движения влево
    @Override
    public void moveLeft()
    {
        x = x - xSpeed;
    }

    // метод движения вправо
    @Override
    public void moveRight()
    {
        x = x + xSpeed;
    }

    // метод копирования
    @Override
    public MovablePoint copy()
    {
        MovablePoint newPoint = new MovablePoint(x, y, xSpeed, ySpeed);
        return newPoint;
    }

    // метод преобразования в строку
    public String toString()
    {
        String string = "X coordinate = " + x + ", y coordinate = " + y + ", speed by x = " + xSpeed + ", speed by y = " + ySpeed;
        return string;
    }
}