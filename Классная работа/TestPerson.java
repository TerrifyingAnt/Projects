import java.lang.String;

public class TestPerson{
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        PersonException personExc = new PersonException();

        person.setName("Artyom");
        if(person.getName == "")
            System.out.println("It's impossible");
        person.setAge(19);
        if(person.getAge > 120 || person.getAge < 0)
            System.out.println("It's impossible");
        person.setHeight(1.9);
        if(person.getHeight > 3.2 || person.getHeight < 0)
            System.out.println("It's impossible");
        person.getName();
        person.getAge();
        person.getHeight();
        person.isValid();
        person.info();
    }
}
