package Auhtor;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String mail, char gender){
        this.name = name;
        this.email = mail;
        this.gender = gender;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return this.name+" is author. " + this.name + " is " + this.gender+", it's email is: "+this.email;
    }


}
