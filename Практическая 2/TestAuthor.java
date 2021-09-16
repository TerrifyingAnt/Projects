import Auhtor.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author p1 = new Author("Olga","pigeon@mail.ru",'F');
        Author p2 = new Author("Zamyatin","651654374654@worldweb.com",'M');
        System.out.println(p1.getName());
        System.out.println(p1.getGender());
        System.out.println(p1.getEmail());
        System.out.println(p2.getName());
        System.out.println(p2.getGender());
        System.out.println(p2.getEmail());
        p2.setEmail("aboba@yandex.ru");
        System.out.println(p2.getEmail());
        System.out.println(p1.getName());
        System.out.println(p1);
        System.out.println(p2);
    }
}
