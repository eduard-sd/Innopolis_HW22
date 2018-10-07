package ru.sayakhov.comparable;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int i = name.compareTo(o.getName());
        if (i != 0 )return i;
        i = name.compareTo(o.getName());
        if (i != 0) return i;
        return Integer.compare(age, o.age);
    }

// Попытка создать Comparable с двумя полями
//    @Override
//    public int compareTo(Person obj)
//    {
//        Person entry = (Person) obj;
//        int result = name.compareTo(entry.name);
//        if(result != 0)
//            return result;
//
//        result = age - entry.age;
//        if(result != 0)
//            return (int) result / Math.abs( result );
//
//        return 0;
//    }


}
