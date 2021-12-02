public class MovableCircle implements Movable
{
    private int radius; // свойство, хранящее радиус
    private MovablePoint center; // свойство хранящее точку-центр

    // конструктор
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    // метод движения вверх
    @Override
    public void moveUp()
    {
        center.y = center.y + center.ySpeed;
    }

    // метод движения вниз
    @Override
    public void moveDown()
    {
        center.y = center.y - center.ySpeed;
    }

    // метод движения влево
    @Override
    public void moveLeft()
    {
        center.x = center.x - center.xSpeed;
    }

    // метод движения вправо
    @Override
    public void moveRight()
    {
        center.x = center.x + center.xSpeed;
    }

    // метод копирования
    @Override
    public MovableCircle copy()
    {
        MovableCircle newCircle = new MovableCircle(center.x, center.y, center.xSpeed, center.ySpeed, radius);
        return newCircle;
    }

    // метод преобразования в строку
    public String toString()
    {
        String string;
        string = "X coordinate = " + center.x + ", y coordinate = " + center.y + ", radius of circle = " + radius + ", speed by x = " + center.xSpeed + ", speed by y = " + center.ySpeed;
        return string;
    }
}