import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dog animal = new Dog("Sam", 2);
        animal.intoHumanAge();
        System.out.println(animal);

        Ball blue_ball = new Ball("rubber", "blue");
        blue_ball.setMaterial("Silicon");
        System.out.println(blue_ball);

        Book genius_book = new Book("We", "horror");
        genius_book.setGenre("roman");
        System.out.println(genius_book);
    }
}
