public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    public Dog(String n) {
        name = n;
        age = 0;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(String name){
        return name;
    }

    public int getAge(int age){
        return age;
    }

    public String toString() {
        return this.name + ", it is " + this.age + " years old";
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is " + age * 7 + " years");
    }

}