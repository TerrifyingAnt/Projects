public class Person{
    private final int MAX_AGE = 200;
    private final double MAX_HEIGHT = 3.2;
    private String name;
    private int age;
    private double height;
    private boolean nameValid = false;
    private boolean ageValid = false;
    private boolean heightValid = false;

    public void setName(String name) {
        this.name = name;
        if(name == "")
            nameValid = false;
        else
            nameValid = true;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < MAX_AGE && age > 0)
            ageValid = true;
        else
            ageValid = false;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height < MAX_HEIGHT && height > 0)
            heightValid = true;
        else
            heightValid = false;
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
        return name + " - is your person. " + name + " is " + Integer.toString(age) + " years old and " + Double.toString(height) + " meters height";
    }

    public boolean isValid() {
        return nameValid && ageValid && heightValid;
    }

    public void info() {
        if(isValid())
            System.out.println(this.toString());
        else
            System.out.println("Something went wrong(((");
    }
}
