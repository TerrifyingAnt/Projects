import java.lang.Exception;
import java.util.Scanner;

public class PersonException {
    private final int MAX_AGE = 200;
    private final double MAX_HEIGHT = 3;

    private String name;
    private int age;
    private double height;

    private boolean nameValid = false;
    private boolean ageValid = false;
    private boolean heightValid = false;
    private Gender gender;

    public enum Gender {
        MALE(1, "Male"), FEMALE(2, "Female"), OTHER(1024, "Other");

        private Gender(int val, String str) {
            value = val;
            strValue = str;
        }

        private final int value;
        private final String strValue;

        public int getValue() {
            return value;
        }
        public String getStrValue() {
            return strValue;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) throws IllegalNameException {
        if(name.isEmpty())
            throw new IllegalNameException("Something went wrong, try one more time!)");
        this.name = name;
        nameValid = true;
    }

    public void setAge(int age) throws IllegalAssignmentException {
        if(age < 0 || age > MAX_AGE)
            throw new IllegalAssignmentException("Something went wrong, try one more time!)");
        this.age = age;
        ageValid = true;
    }

    public void setHeight(double height) throws IllegalAssignmentException {
        if(height >= MAX_HEIGHT || height < 0)
            throw new IllegalAssignmentException("Something went wrong, try one more time!)");
        this.height = height;
        heightValid = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " - is " + gender + ". " + name + " is " + Integer.toString(age) + " years old and " + Double.toString(height) + " meters height.";
    }

    public boolean isValid() {
        return nameValid && ageValid && heightValid;
    }

    public void info() {
        if(isValid())
            System.out.println(this.toString());
        else
            System.out.println("Something went wrong, try one more time!)");
    }

}
