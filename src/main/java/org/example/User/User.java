package org.example.User;


public class User {
    private String name;
    private int age;

    public User(String name, int age) throws UserException {
        setName(name);
        setAge(age);
    }

    public User(String name) throws UserException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UserException {
        if (age >= 1 && age < 110) {
            this.age = age;
        } else {
            throw new UserException("Invalid age. Age must be from 1 to 110 years");
        }
    }

    public void setName(String name) throws UserException{
        boolean result = name.matches("^[a-zA-Z]+$");
        if (result){
            this.name = name;
        }
        else {
            throw new UserException("Invalid name.Name must be without digits and special characters");
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", age " + age;
    }
}
