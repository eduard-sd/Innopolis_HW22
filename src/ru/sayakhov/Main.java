package ru.sayakhov;

import ru.sayakhov.comparable.Person;
import ru.sayakhov.comparator.PersonComparator;
import ru.sayakhov.comparator.PersonComparatorAge;
import ru.sayakhov.comparator.PersonSecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person mike = new Person("Mike", 29);
        Person bob = new Person("Bob", 31);
        Person kate = new Person("Kate", 25);
        Person kris = new Person("Kris", 20);

        PersonSecond mikeT = new PersonSecond("Mike", 29);
        PersonSecond bobT = new PersonSecond("Bob", 31);
        PersonSecond kateT = new PersonSecond("Kate", 25);
        PersonSecond krisT = new PersonSecond("Kris", 20);

        List<Person> personList = new ArrayList<>();
        personList.add(mike);
        personList.add(bob);
        personList.add(kate);
        personList.add(kris);

        List<PersonSecond> personTwoArray = new ArrayList<>();
        personTwoArray.add(mikeT);
        personTwoArray.add(bobT);
        personTwoArray.add(kateT);
        personTwoArray.add(krisT);

        System.out.println(personTwoArray);
        System.out.println("Comparable: ");
        for ( Person i : personList ) {
            System.out.println(i.getName()+" "+i.getAge());
        }
        System.out.println();
        Collections.sort(personList);

        for ( Person i : personList ) {
            System.out.println(i.getName()+" "+i.getAge());
        }
        System.out.println("==========================");
        System.out.println("Comparator:  ");
        for ( PersonSecond i : personTwoArray ) {
            System.out.println(i.getName()+" "+i.getAge());
        }
        System.out.println();

        Collections.sort(personTwoArray, new PersonComparator());
        Collections.sort(personTwoArray, new PersonComparatorAge());

        for ( PersonSecond i : personTwoArray ) {
            System.out.println(i.getName()+" "+i.getAge());
        }
    }
}
