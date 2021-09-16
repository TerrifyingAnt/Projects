import java.lang.String;

public class TestPerson{
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        PersonException personExc = new PersonException();

        person.setName("Artyom");
        person.setAge(19);
        person.setHeight(1.9);
        person.getName();
        person.getAge();
        person.getHeight();
        person.isValid();
        person.info();
    }
}
