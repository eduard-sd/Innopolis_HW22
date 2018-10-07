package ru.sayakhov.comparator;

public class PersonSecond {
    private String name;
    private int age;

    public PersonSecond(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonSecond{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
